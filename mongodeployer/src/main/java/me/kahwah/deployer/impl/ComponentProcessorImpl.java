package me.kahwah.deployer.impl;

import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dd4t.contentmodel.Component;
import me.kahwah.dd4t.core.serializers.Serializer;
import me.kahwah.deployer.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public class ComponentProcessorImpl implements Processor {

    private static Logger log = LoggerFactory.getLogger(ComponentProcessorImpl.class);

    private Serializer serializer;
    private ComponentDAO componentDao;
    private ComponentPresentationDAO componentPresentationDao;

    @Override
    public void process(File file) {
        Component component;
        try {
            component = (Component)serializer.deserialize(file, Component.class);

            log.info("Component id " + component.getId());
        } catch (Exception e) {
            log.warn("Not component XML");
        }
    }

    public Serializer getSerializer() {
        return serializer;
    }

    public void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    public ComponentDAO getComponentDao() {
        return componentDao;
    }

    public void setComponentDao(ComponentDAO componentDao) {
        this.componentDao = componentDao;
    }

    public ComponentPresentationDAO getComponentPresentationDao() {
        return componentPresentationDao;
    }

    public void setComponentPresentationDao(ComponentPresentationDAO componentPresentationDao) {
        this.componentPresentationDao = componentPresentationDao;
    }
}
