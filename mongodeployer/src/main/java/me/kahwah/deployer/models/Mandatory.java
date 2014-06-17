package me.kahwah.deployer.models;

import org.simpleframework.xml.Element;

/**
 * Created by rainmaker2k on 16-06-14.
 */
public class Mandatory {

    @Element
    private String title;

    @Element
    private VersionInfo versionInfo;

    @Element
    private Schema schema;

    @Element
    private OwningPublication owningPublication;

    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OwningPublication getOwningPublication() {
        return owningPublication;
    }

    public void setOwningPublication(OwningPublication owningPublication) {
        this.owningPublication = owningPublication;
    }

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }
}
