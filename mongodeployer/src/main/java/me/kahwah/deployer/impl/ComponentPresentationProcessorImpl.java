package me.kahwah.deployer.impl;

import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dd4t.core.serializers.Serializer;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.Processor;
import me.kahwah.deployer.models.Section;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public class ComponentPresentationProcessorImpl implements Processor<Section> {

    private static Logger log = LoggerFactory.getLogger(ComponentPresentationProcessorImpl.class);

    private PackageService packageService;
    private Serializer serializer;
    private ComponentDAO componentDao;
    private ComponentPresentationDAO componentPresentationDao;

    @Override
    public void process(Section section, String extractedDir) {

        Path xmlfilePath = Paths.get(extractedDir, section.getName());
        //packageService.get
//        Component component;
//        try {
//            component = (Component)serializer.deserialize(file, Component.class);
//
//            log.info("Component id " + component.getId());
//        } catch (Exception e) {
//            log.warn("Not component XML");
//        }
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

    public PackageService getPackageService() {
        return packageService;
    }

    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }
}
