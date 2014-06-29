package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import me.kahwah.dao.KeywordDAO;
import me.kahwah.dao.models.RepositoryItem;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 30/05/14.
 */
public class KeywordDAOImpl extends KeywordDAO {
    public KeywordDAOImpl(MongoClient client, Morphia morphia, String dbName) {
        super(client, morphia, dbName);
    }

}
