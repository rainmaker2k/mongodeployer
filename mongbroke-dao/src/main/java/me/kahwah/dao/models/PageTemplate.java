package me.kahwah.dao.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

/**
 * Created by rainmaker2k on 03-06-14.
 */
public class PageTemplate extends BaseRepositoryItem {

    @Id
    private ObjectId id;

    private String fileExtension;

    private Map<String, Object> metadataFields;

    public Map<String, Object> getMetadataFields() {
        return metadataFields;
    }

    public void setMetadataFields(Map<String, Object> metadataFields) {
        this.metadataFields = metadataFields;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }
}

