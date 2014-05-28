package me.kahwah.dao;

import com.mongodb.Mongo;
import me.kahwah.models.Page;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.List;

/**
 * Created by rainmaker2k on 24/05/14.
 */
public abstract class PageDAO extends BasicDAO<Page, ObjectId> {

    public PageDAO(Mongo mongo, Morphia morphia, String dbName) {
        super(Page.class, mongo, morphia, dbName);
    }

    public abstract Page findByUrl(String url);
}
