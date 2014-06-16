package me.kahwah.deployer.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by rainmaker2k on 16-06-14.
 */
@Root(name="component")
public class Component {

    @Attribute(name="id")
    private String id;

    @Attribute(name="isMultimedia")
    private boolean multimedia;

    @Element(name="mandatory")
    private Mandatory mandatory;

    public Mandatory getMandatory() {
        return mandatory;
    }

    public void setMandatory(Mandatory mandatory) {
        this.mandatory = mandatory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }
}
