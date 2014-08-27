package me.kahwah.dao;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import me.kahwah.dao.models.Keyword;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * Created by rainmaker2k on 30/05/14.
 */
public abstract class KeywordDAO extends BasicDAO<Keyword, ObjectId> {
    public KeywordDAO(MongoClient client, Morphia morphia, String dbName) {
        super(Keyword.class, client, morphia, dbName);
    }
}
