package me.kahwah.dao;

import com.mongodb.MongoClient;
import me.kahwah.dao.models.Binary;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * Created by rainmaker2k on 18/07/14.
 */
public abstract class BinaryDAO extends BasicDAO<Binary, ObjectId>{

    public BinaryDAO(MongoClient mongoClient, Morphia morphia, String dbName) {
        super(Binary.class, mongoClient, morphia, dbName);
    }
}
