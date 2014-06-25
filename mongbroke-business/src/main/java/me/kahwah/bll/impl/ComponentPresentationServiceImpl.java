package me.kahwah.bll.impl;

import me.kahwah.bll.ComponentPresentationService;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dao.models.Component;
import me.kahwah.dd4t.contentmodel.ComponentPresentation;
import me.kahwah.dd4t.contentmodel.Field;
import me.kahwah.dd4t.contentmodel.GenericComponent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rainmaker2k on 25/06/14.
 */
public class ComponentPresentationServiceImpl implements ComponentPresentationService {

    private ComponentPresentationDAO componentPresentationDAO;

    @Override
    public void save(ComponentPresentation componentPresentation) {

        Component component = new Component();
        Map<String, Object> componentFields = new HashMap<String, Object>();
        component.setFields(componentFields);

        GenericComponent genComponent = componentPresentation.getComponent();
        Map<String, Field> fields = genComponent.getContent();

        for (String fieldName : fields.keySet()) {
            Field field = fields.get(fieldName);
//            componentFields.put(fieldName, field.)
        }

        me.kahwah.dao.models.ComponentPresentation dbComponentPresentation =
                new me.kahwah.dao.models.ComponentPresentation();
        dbComponentPresentation.setComponent(component);
    }

    public ComponentPresentationDAO getComponentPresentationDAO() {
        return componentPresentationDAO;
    }

    public void setComponentPresentationDAO(ComponentPresentationDAO componentPresentationDAO) {
        this.componentPresentationDAO = componentPresentationDAO;
    }
}
