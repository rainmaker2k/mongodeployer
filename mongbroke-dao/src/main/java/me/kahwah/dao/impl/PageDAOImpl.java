package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import me.kahwah.dao.PageDAO;
import me.kahwah.dao.models.Page;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 24/05/14.
 */
public class PageDAOImpl extends PageDAO {

    public PageDAOImpl(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }

    @Override
    public Page findByUrl(String url) {
        return getDs().createQuery(Page.class).field("url").equal(url).get();
    }
}
