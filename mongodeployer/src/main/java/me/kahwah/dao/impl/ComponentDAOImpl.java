package me.kahwah.dao.impl;

import com.mongodb.Mongo;
import me.kahwah.dao.ComponentDAO;
import org.mongodb.morphia.Morphia;

/**
 * Created by rainmaker2k on 23/05/14.
 */
public class ComponentDAOImpl extends ComponentDAO {


    public ComponentDAOImpl(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }

}
