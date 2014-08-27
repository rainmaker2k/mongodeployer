package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dao.models.RepositoryItem;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 29-5-2014.
 */
public class ComponentPresentationDAOImpl extends ComponentPresentationDAO {

    public ComponentPresentationDAOImpl(MongoClient client, Morphia morphia, String dbName) {
        super(client, morphia, dbName);
    }

}
