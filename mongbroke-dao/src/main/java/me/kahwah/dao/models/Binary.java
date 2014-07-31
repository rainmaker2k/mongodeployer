package me.kahwah.dao.models;

import me.kahwah.dd4t.contentmodel.impl.MultimediaImpl;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.InputStream;

/**
 * Created by rainmaker2k on 18/07/14.
 */
@Entity("Binary")
public class Binary extends MultimediaImpl {

    @Id
    private ObjectId id;

    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
