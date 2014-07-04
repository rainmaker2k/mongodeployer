package me.kahwah.bll.impl;

import me.kahwah.bll.ComponentService;
import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dao.models.Component;
import me.kahwah.dd4t.contentmodel.ComponentPresentation;

/**
 * Created by rainmaker2k on 25/06/14.
 */
public class ComponentServiceImpl implements ComponentService {

    private ComponentDAO componentDAO;

    @Override
    public void save(Component component) {

        Component dbComponent =
                (Component)component;
        componentDAO.save(dbComponent);

    }


    public ComponentDAO getComponentDAO() {
        return componentDAO;
    }

    public void setComponentDAO(ComponentDAO componentDAO) {
        this.componentDAO = componentDAO;
    }
}
