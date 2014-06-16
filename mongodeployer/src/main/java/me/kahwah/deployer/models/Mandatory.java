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
}
