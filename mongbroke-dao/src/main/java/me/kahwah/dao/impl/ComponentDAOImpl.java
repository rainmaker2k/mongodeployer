package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.models.RepositoryItem;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public class ComponentDAOImpl extends ComponentDAO {

    public ComponentDAOImpl(MongoClient client, Morphia morphia, String dbName) {
        super(client, morphia, dbName);
    }

}
