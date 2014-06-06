package me.kahwah.deployer;

import me.kahwah.dao.ComponentDAO;
import me.kahwah.dao.ComponentPresentationDAO;
import me.kahwah.dao.KeywordDAO;
import me.kahwah.dao.PageDAO;
import org.apache.commons.configuration.XMLConfiguration;

/**
 * Created by rainmaker2k on 23/05/14.
 */

public class Deployer {

    private ComponentDAO componentDao;
    private PageDAO pageDao;
    private ComponentPresentationDAO componentPresentationDao;
    private KeywordDAO keywordDao;
    private XMLConfiguration config;

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

    public KeywordDAO getKeywordDao() {
        return keywordDao;
    }

    public void setKeywordDao(KeywordDAO keywordDao) {
        this.keywordDao = keywordDao;
    }

    public ComponentPresentationDAO getComponentPresentationDao() {
        return componentPresentationDao;
    }

    public void setComponentPresentationDao(ComponentPresentationDAO componentPresentationDao) {
        this.componentPresentationDao = componentPresentationDao;
    }

    public XMLConfiguration getConfig() {
        return config;
    }

    public void setConfig(XMLConfiguration config) {
        this.config = config;
    }
}
