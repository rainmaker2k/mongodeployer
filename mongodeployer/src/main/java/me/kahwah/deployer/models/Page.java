package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by rainmaker2k on 17-06-14.
 */
@Root(name = "page")
public class Page {

    @Attribute(name = "Id")
    private String id;

    @Attribute(name = "Name", required = false)
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
