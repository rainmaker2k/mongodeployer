package me.kahwah.deployer.impl;

import me.kahwah.bll.ComponentPresentationService;
import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dd4t.contentmodel.ComponentPresentation;
import me.kahwah.dd4t.core.serializers.Serializer;
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
    private ComponentPresentationService componentPresentationService;

    @Override
    public void process(Section section, String extractedDir) {

        Path componentPresentationsFilePath = Paths.get(extractedDir, section.getName());
        List<ComponentPresentation> componentPresentations = packageService.getSectionItems(section, section.getName());

        for (ComponentPresentation componentPresentation : componentPresentations) {
            componentPresentationService.save(componentPresentation);
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

    public ComponentPresentationService getComponentPresentationService() {
        return componentPresentationService;
    }

    public void setComponentPresentationService(ComponentPresentationService componentPresentationService) {
        this.componentPresentationService = componentPresentationService;
    }

}
