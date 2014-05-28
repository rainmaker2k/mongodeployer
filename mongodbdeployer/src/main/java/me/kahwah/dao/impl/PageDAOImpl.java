package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import me.kahwah.dao.PageDAO;
import me.kahwah.models.Page;
import org.mongodb.morphia.Morphia;

import java.util.List;

/**
 * Created by rainmaker2k on 24/05/14.
 */
public class PageDAOImpl extends PageDAO {

    public PageDAOImpl(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }

    @Override
    public Page findOneByQuery(String query) {
        return null;
    }

    @Override
    public List<Page> findByQuery() {
        return null;
    }

    @Override
    public Page findByUrl(String url) {
        return null;
    }
}
