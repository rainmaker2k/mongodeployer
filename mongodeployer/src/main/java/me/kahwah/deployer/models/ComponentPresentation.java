package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by rainmaker2k on 17-06-14.
 */
@Root(name = "componentPresentation")
public class ComponentPresentation {

    @Attribute(name = "ComponentId")
    private String componentId;

    @Attribute(name = "Name")
    private String name;

    @Attribute(name = "TemplateId")
    private String templateId;

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
