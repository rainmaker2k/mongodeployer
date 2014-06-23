package me.kahwah.deployer.impl;

import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.Processor;
import me.kahwah.deployer.models.ComponentPresentation;
import me.kahwah.deployer.models.MetaData;
import me.kahwah.util.TridionUri;
import org.mongodb.morphia.query.Query;

import java.util.List;

/**
 * Created by rainmaker2k on 20/06/14.
 */
public class ComponentPresentationMetaDataProcessor implements Processor<MetaData> {

    private PackageService packageService;
    private ComponentPresentationDAO componentPresentationDAO;

    @Override
    public void process(MetaData metaData, String extractedDir) {
        List<ComponentPresentation> componentPresentations = (List<ComponentPresentation>)packageService.getMetaData(metaData, extractedDir);

        for (ComponentPresentation componentPresentation : componentPresentations) {

            me.kahwah.dao.models.ComponentPresentation dbComponentPresentation = null;

            TridionUri componentUri = new TridionUri(componentPresentation.getComponentId());
            TridionUri templateUri = new TridionUri(componentPresentation.getTemplateId());

            Query<ComponentPresentation> query = componentPresentationDAO.getDs().createQuery(ComponentPresentation.class);
//            query.field("componentId").equals(componentPresentation.get);
//            query.field("publicationId").equals(1);
//            dbComponentPresentation = componentPresentationDAO.findOne()
//            new me.kahwah.dao.models.ComponentPresentation();
//
//            dbComponentPresentation

            componentPresentationDAO.save(dbComponentPresentation);
        }

    }

    public PackageService getPackageService() {
        return packageService;
    }

    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }

    public ComponentPresentationDAO getComponentPresentationDAO() {
        return componentPresentationDAO;
    }

    public void setComponentPresentationDAO(ComponentPresentationDAO componentPresentationDAO) {
        this.componentPresentationDAO = componentPresentationDAO;
    }
}
