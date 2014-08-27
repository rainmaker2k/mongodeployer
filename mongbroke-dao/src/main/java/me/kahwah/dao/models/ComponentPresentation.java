package me.kahwah.dao.models;

import me.kahwah.dd4t.contentmodel.impl.ComponentPresentationImpl;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

/**
 * Created by rainmaker2k on 27-5-2014.
 */
@Entity("ComponentPresentation")
public class ComponentPresentation extends ComponentPresentationImpl {

    @Id
    private ObjectId id;
}
