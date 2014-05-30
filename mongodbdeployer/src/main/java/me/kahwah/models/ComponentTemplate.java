package me.kahwah.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

/**
 * Created by rainmaker2k on 27-5-2014.
 */

public class ComponentTemplate extends RepositoryItem {

    @Id
    private ObjectId id;

    private Map<String, Object> metadataFields;

    public Map<String, Object> getMetadataFields() {
        return metadataFields;
    }

    public void setMetadataFields(Map<String, Object> metadataFields) {
        this.metadataFields = metadataFields;
    }
}
