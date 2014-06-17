package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;

/**
 * Created by rainmaker2k on 17-06-14.
 */
public class OwningPublication {

    @Attribute(name = "Id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
