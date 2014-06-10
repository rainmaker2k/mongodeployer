package me.kahwah.deployer;

import me.kahwah.dd4t.contentmodel.Component;
import me.kahwah.dd4t.core.serializers.Serializer;

import java.io.File;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public class Processor {

    private Serializer serializer;

    public void process(File file) {
        Component component;
        try {
            component = (Component)serializer.deserialize(file, Component.class);

            System.out.println(component.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Serializer getSerializer() {
        return serializer;
    }

    public void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }
}
