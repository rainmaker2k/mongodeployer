package me.kahwah.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */
@Entity("Component")
public class Component extends RepositoryItem {

    @Id
    private ObjectId id;

    private Map<String, Object> fields;
    private Map<String, Object> metadataFields;

}
