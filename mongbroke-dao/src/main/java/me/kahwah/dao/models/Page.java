package me.kahwah.dao.models;

import me.kahwah.dd4t.contentmodel.impl.GenericPageImpl;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */
@Entity("Page")
public class Page extends GenericPageImpl {

    @Id
    private ObjectId id;

}
