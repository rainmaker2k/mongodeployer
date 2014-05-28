package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import me.kahwah.dao.ComponentDAO;
import me.kahwah.models.Component;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.List;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public class ComponentDAOImpl extends ComponentDAO {


    public ComponentDAOImpl(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }

}
