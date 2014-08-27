package me.kahwah.dao;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import me.kahwah.dao.models.ComponentPresentation;
import me.kahwah.dao.models.RepositoryItem;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

/**
 * Created by rainmaker2k on 29-5-2014.
 */
public abstract class ComponentPresentationDAO extends BasicDAO<ComponentPresentation, ObjectId> {

    public ComponentPresentationDAO(MongoClient client, Morphia morphia, String dbName) {
        super(ComponentPresentation.class, client, morphia, dbName);
    }

}
