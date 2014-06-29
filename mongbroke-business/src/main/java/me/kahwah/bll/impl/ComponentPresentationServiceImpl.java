package me.kahwah.bll.impl;

import me.kahwah.bll.ComponentPresentationService;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dd4t.contentmodel.ComponentPresentation;

/**
 * Created by rainmaker2k on 25/06/14.
 */
public class ComponentPresentationServiceImpl implements ComponentPresentationService {

    private ComponentPresentationDAO componentPresentationDAO;

    @Override
    public void save(ComponentPresentation componentPresentation) {

        me.kahwah.dao.models.ComponentPresentation dbComponentPresentation =
                (me.kahwah.dao.models.ComponentPresentation)componentPresentation;
        componentPresentationDAO.save(dbComponentPresentation);

    }

    public ComponentPresentationDAO getComponentPresentationDAO() {
        return componentPresentationDAO;
    }

    public void setComponentPresentationDAO(ComponentPresentationDAO componentPresentationDAO) {
        this.componentPresentationDAO = componentPresentationDAO;
    }
}
