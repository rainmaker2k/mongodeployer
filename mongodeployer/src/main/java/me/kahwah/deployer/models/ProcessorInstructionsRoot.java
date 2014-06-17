package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by rainmaker2k on 17-06-14.
 */
@Root(name="ProcessorInstructions")
public class ProcessorInstructionsRoot {

    @Attribute
    private String version;

    @Element
    private String action;

    @Element
    private Target target;

    @Element
    private Publication publication;

    @ElementList(inline=true)
    private List<Section> sections;

    @ElementList(inline=true)
    private List<MetaData> metaData;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public List<MetaData> getMetaData() {
        return metaData;
    }

    public void setMetaData(List<MetaData> metaData) {
        this.metaData = metaData;
    }
}
