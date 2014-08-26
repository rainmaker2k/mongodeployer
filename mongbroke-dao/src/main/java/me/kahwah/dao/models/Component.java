package me.kahwah.dao.models;

import me.kahwah.dd4t.contentmodel.impl.GenericComponentImpl;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */
@Entity("Component")
public class Component extends GenericComponentImpl {

    @Id
    private ObjectId id;

    public ObjectId getObjectId() {
        return this.id;
    }


    public void setId(ObjectId id) {
        this.id = id;
    }
}
