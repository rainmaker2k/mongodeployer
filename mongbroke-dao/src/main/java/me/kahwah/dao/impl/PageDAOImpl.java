package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import me.kahwah.dao.PageDAO;
import me.kahwah.dao.models.Page;
import me.kahwah.dao.models.RepositoryItem;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 24/05/14.
 */
public class PageDAOImpl extends PageDAO {

    public PageDAOImpl(MongoClient client, Morphia morphia, String dbName) {
        super(client, morphia, dbName);
    }

    @Override
    public Page findByUrl(String url) {
        return getDs().createQuery(Page.class).field("url").equal(url).get();
    }

}
