package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;

/**
 * Created by rainmaker2k on 17-06-14.
 */
public class Target {

    @Attribute(name="Type")
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
