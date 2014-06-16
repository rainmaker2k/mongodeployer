package me.kahwah.dao.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;

/**
 * Created by rainmaker2k on 29-5-2014.
 */
public class Keyword extends RepositoryItem {
    @Id
    private ObjectId id;

    private String key;
    private Map<String, Object> metadataFields;
    private List<ObjectId> children;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Map<String, Object> getMetadataFields() {
        return metadataFields;
    }

    public void setMetadataFields(Map<String, Object> metadataFields) {
        this.metadataFields = metadataFields;
    }

    public List<ObjectId> getChildren() {
        return children;
    }

    public void setChildren(List<ObjectId> children) {
        this.children = children;
    }
}
