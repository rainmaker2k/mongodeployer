package me.kahwah.deployer.models;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by rainmaker2k on 16-06-14.
 */
@Root(name="components")
public class ComponentRoot {

    @ElementList(inline = true)
    private List<Component> components;

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
