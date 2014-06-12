package me.kahwah.deployer.impl;

import me.kahwah.dd4t.contentmodel.Component;
import me.kahwah.dd4t.core.serializers.Serializer;
import me.kahwah.deployer.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public class ProcessorImpl implements Processor {

    private static Logger log = LoggerFactory.getLogger(ProcessorImpl.class);

    private Serializer serializer;

    @Override
    public void process(File file) {
        Component component;
        try {
            component = (Component)serializer.deserialize(file, Component.class);

            log.info("Component id " + component.getId());
        } catch (Exception e) {
            log.warn("Not component XML");
        }
    }

    public Serializer getSerializer() {
        return serializer;
    }

    public void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }
}
