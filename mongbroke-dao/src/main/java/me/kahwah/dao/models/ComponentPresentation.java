package me.kahwah.dao.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

/**
 * Created by rainmaker2k on 27-5-2014.
 */
public class ComponentPresentation {

    @Id
    private ObjectId id;

    private Component component;
    private Date lastPublishDate;
    private ComponentTemplate componentTemplate;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public ComponentTemplate getComponentTemplate() {
        return componentTemplate;
    }

    public void setComponentTemplate(ComponentTemplate componentTemplate) {
        this.componentTemplate = componentTemplate;
    }

    public Date getLastPublishDate() {
        return lastPublishDate;
    }

    public void setLastPublishDate(Date lastPublishDate) {
        this.lastPublishDate = lastPublishDate;
    }
}
