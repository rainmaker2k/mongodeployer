package me.kahwah.dao.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public class Page extends BaseRepositoryItem {

    @Id
    private ObjectId id;
    private Date lastPublishDate;
    private String filename;
    private String url;

    private Map<String, Object> metadataFields;

    private List<ComponentPresentation> componentPresentations;

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

    public Map<String, Object> getMetadataFields() {
        return metadataFields;
    }

    public void setMetadataFields(Map<String, Object> metadataFields) {
        this.metadataFields = metadataFields;
    }

    public List<ComponentPresentation> getComponentPresentations() {
        return componentPresentations;
    }

    public void setComponentPresentations(List<ComponentPresentation> componentPresentations) {
        this.componentPresentations = componentPresentations;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
