package me.kahwah.deployer;

import me.kahwah.dd4t.contentmodel.Component;
import me.kahwah.dd4t.core.serializers.Serializer;

import java.io.File;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public interface Processor {

    void process(File file);
}
