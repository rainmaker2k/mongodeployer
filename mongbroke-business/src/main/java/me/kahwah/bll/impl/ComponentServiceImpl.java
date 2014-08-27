package me.kahwah.bll.impl;

import me.kahwah.bll.ComponentService;
import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dao.models.Component;
import me.kahwah.dd4t.contentmodel.ComponentPresentation;
import me.kahwah.util.TridionUri;
import org.mongodb.morphia.query.Query;

/**
 * Created by rainmaker2k on 25/06/14.
 */
public class ComponentServiceImpl implements ComponentService {

    private ComponentDAO componentDAO;

    @Override
    public void save(Component component) {
        TridionUri componentUri = new TridionUri(component.getId());

        Query<Component> query = componentDAO.getDs().createQuery(Component.class);
        query.criteria("id").equals(component.getId());

        Component existingComponent = componentDAO.findOne(query);

        if (existingComponent != null) {
            component.setId(existingComponent.getId());
            component.setId(existingComponent.getObjectId());
        }

        componentDAO.save(component);

//            query.field("publicationId").equals(1);
//            dbComponentPresentation = componentPresentationDAO.findOne()
//            new me.kahwah.dao.models.ComponentPresentation();
//
//            dbComponentPresentation



    }


    public ComponentDAO getComponentDAO() {
        return componentDAO;
    }

    public void setComponentDAO(ComponentDAO componentDAO) {
        this.componentDAO = componentDAO;
    }
}
