package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by rainmaker2k on 17-06-14.
 */
@Root(name = "section")
public class Section {

    @Attribute(name = "Type")
    private String type;

    @Attribute(name = "Name")
    private String name;

    @ElementList(required = false, inline = true)
    private List<ComponentPresentation> componentPresentations;

    @ElementList(required = false, inline = true)
    private List<Page> pages;

    @ElementList(required = false, inline = true)
    private List<Schema> schemas;

    @ElementList(required = false, inline = true)
    private List<Binary> binaries;

    @ElementList(required = false, inline = true)
    private List<Section> sections;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ComponentPresentation> getComponentPresentations() {
        return componentPresentations;
    }

    public void setComponentPresentations(List<ComponentPresentation> componentPresentations) {
        this.componentPresentations = componentPresentations;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public List<Schema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<Schema> schemas) {
        this.schemas = schemas;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public List<Binary> getBinaries() {
        return binaries;
    }

    public void setBinaries(List<Binary> binaries) {
        this.binaries = binaries;
    }
}
