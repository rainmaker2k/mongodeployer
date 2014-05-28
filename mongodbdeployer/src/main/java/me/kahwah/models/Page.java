package me.kahwah.models;

import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public class Page extends RepositoryItem {

    private Date lastPublishDate;
    private String filename;
    private String url;

    private Map<String, Object> metadataFields;

    private List<ObjectId> componentPresentations;

    public Date getLastPublishDate() {
        return lastPublishDate;
    }

    public void setLastPublishDate(Date lastPublishDate) {
        this.lastPublishDate = lastPublishDate;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
