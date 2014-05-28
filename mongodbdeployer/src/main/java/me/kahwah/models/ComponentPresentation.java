package me.kahwah.models;

import org.bson.types.ObjectId;

import java.util.Date;

/**
 * Created by rainmaker2k on 27-5-2014.
 */
public class ComponentPresentation {

    private ObjectId component;
    private Date lastPublishDate;
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

    public Date getLastPublishDate() {
        return lastPublishDate;
    }

    public void setLastPublishDate(Date lastPublishDate) {
        this.lastPublishDate = lastPublishDate;
    }
}
