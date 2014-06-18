package me.kahwah.deployer.models;

import org.simpleframework.xml.Element;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by rainmaker2k on 16-06-14.
 */
public class VersionInfo {

    @Element
    private int version;
    @Element
    private int revision;
    @Element
    private Date creationDate;
    @Element
    private Date revisionDate;
    @Element
    private String author;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Date revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
