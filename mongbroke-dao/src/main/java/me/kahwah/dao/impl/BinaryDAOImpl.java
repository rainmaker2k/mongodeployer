package me.kahwah.dao.impl;

import com.mongodb.MongoClient;
import me.kahwah.dao.BinaryDAO;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 31-7-2014.
 */
public class BinaryDAOImpl extends BinaryDAO {

    public BinaryDAOImpl(MongoClient mongoClient, Morphia morphia, String dbName) {
        super(mongoClient, morphia, dbName);
    }
}
