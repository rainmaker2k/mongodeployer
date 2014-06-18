package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by rainmaker2k on 17-06-14.
 */
@Root(name = "metaData")
public class MetaData {

    @Attribute(name = "Type")
    private String type;

    @Attribute(name = "Name")
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
