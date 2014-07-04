package me.kahwah.deployer.impl;

import me.kahwah.bll.ComponentService;
import me.kahwah.dao.models.Component;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.Processor;
import me.kahwah.deployer.models.Section;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public class ComponentPresentationProcessorImpl implements Processor<Section> {

    private static Logger log = LoggerFactory.getLogger(ComponentPresentationProcessorImpl.class);

    private PackageService packageService;
    private ComponentService componentService;

    @Override
    public void process(Section section, String extractedDir) {

        Path componentPresentationsFilePath = Paths.get(extractedDir, section.getName());
        List<Component> components = packageService.getSectionItems(section, extractedDir);

        for (Component component : components) {
            componentService.save(component);
        }
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

    public PackageService getPackageService() {
        return packageService;
    }

    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }

    public ComponentService getComponentService() {
        return componentService;
    }

    public void setComponentService(ComponentService componentService) {
        this.componentService = componentService;
    }

}
