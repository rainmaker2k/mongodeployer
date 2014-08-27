/**  
 *  Copyright 2011 Capgemini & SDL
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package me.kahwah.dd4t.core.serializers.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

import me.kahwah.dd4t.contentmodel.*;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Registry;
import org.simpleframework.xml.convert.RegistryStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.stream.InputNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Class to serialize and deserialize the xml source from tridion.
 * 
 * @author bjornl
 * 
 */
public class DefaultSerializer implements
        me.kahwah.dd4t.core.serializers.Serializer {

	private static Logger logger = LoggerFactory.getLogger(DefaultSerializer.class);
	private Serializer serializer;

	public DefaultSerializer() {
		this.init();
	}
	
	/**
	 * Initialize the serializer. 
	 */
	protected void init(){
		Registry registry = new Registry();
		Strategy strategy = new RegistryStrategy(registry);
		this.serializer = new Persister(strategy);
		GenericConverter converter = new GenericConverter(this);

		try {
			registry.bind(Page.class, converter);
			registry.bind(GenericPage.class, converter);
			registry.bind(Component.class, converter);
			registry.bind(GenericComponent.class, converter);
			registry.bind(Publication.class, converter);
			registry.bind(ComponentPresentation.class, converter);
            registry.bind(Condition.class, converter);
			registry.bind(ComponentTemplate.class, converter);
			registry.bind(PageTemplate.class, converter);
			registry.bind(OrganizationalItem.class, converter);
			registry.bind(Schema.class, converter);
			registry.bind(Multimedia.class, converter);
			registry.bind(StructureGroup.class, converter);
			registry.bind(Field.class, converter);
			registry.bind(FieldSet.class, converter);
		} catch (Exception e) {
			logger.error("Error registring classes to converter", e);
			throw new RuntimeException(e);
		}
	}
		


	
	@Override
	@SuppressWarnings(value = { "rawtypes", "unchecked" })
	public Object deserialize(Object object, Class c) throws Exception {
		String currentNodeName = "";
		try {
			if (object != null) {
				if(object instanceof InputNode){
					logger.debug("about to read node " + ((InputNode) object).getName());
					currentNodeName = ((InputNode) object).getName();
					return serializer.read(c, (InputNode) object);
				}
                else if (object instanceof File) {
                    logger.debug("deserializing from file");
                    return serializer.read(c, (File)object);
                }
                else if (object instanceof InputStream) {
                    logger.debug("deserialize from stream");
                    return serializer.read(c, (InputStream)object);
                }
				else {
					logger.debug("about to read string of length " + ((String)object).length());
					return serializer.read(c, object.toString());
				}
			} else {
				return null;
			}
		} catch (Exception e) {
			logger.error("error deserializing to class " + c.getName() + " error occurred while deserializing node " + currentNodeName, e);
			throw new RuntimeException("Error deserializing node " + currentNodeName + ", target class " + c.getName(), e);
		}
	}

	@Override
	public Serializable serialize(Object o) throws Exception {
		Serializer serializer = new Persister();
		ByteArrayOutputStream sos = new ByteArrayOutputStream();
		serializer.write(o, sos);
		return sos.toString();
	}
}