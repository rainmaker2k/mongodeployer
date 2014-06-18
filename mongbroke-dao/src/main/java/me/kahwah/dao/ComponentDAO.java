package me.kahwah.dao;

import com.mongodb.Mongo;
import me.kahwah.dao.models.Component;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public abstract class ComponentDAO extends BasicDAO<Component, ObjectId> {

    public ComponentDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(Component.class, mongo, morphia, dbName);
    }

}
