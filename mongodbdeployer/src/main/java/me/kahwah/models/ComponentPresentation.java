package me.kahwah.models;

import org.bson.types.ObjectId;

/**
 * Created by rainmaker2k on 27-5-2014.
 */
public class ComponentPresentation {

    private ObjectId component;

    private ObjectId componentTemplate;

    public ObjectId getComponent() {
        return component;
    }

    public void setComponent(ObjectId component) {
        this.component = component;
    }

    public ObjectId getComponentTemplate() {
        return componentTemplate;
    }

    public void setComponentTemplate(ObjectId componentTemplate) {
        this.componentTemplate = componentTemplate;
    }
}
