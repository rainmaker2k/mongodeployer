package me.kahwah.deployer;

import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.PageDAO;

/**
 * Created by rainmaker2k on 23/05/14.
 */

public class Deployer {

    private ComponentDAO componentDao;

    private PageDAO pageDao;

    public ComponentDAO getComponentDao() {
        return componentDao;
    }

    public void setComponentDao(ComponentDAO componentDao) {
        this.componentDao = componentDao;
    }

    public PageDAO getPageDao() {
        return pageDao;
    }

    public void setPageDao(PageDAO pageDao) {
        this.pageDao = pageDao;
    }
}
