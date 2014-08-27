package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by rainmaker2k on 24/07/14.
 */
@Root(name="binary")
public class Binary {

    @Attribute(name="Id")
    private String id;

    @Attribute(name = "Name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
