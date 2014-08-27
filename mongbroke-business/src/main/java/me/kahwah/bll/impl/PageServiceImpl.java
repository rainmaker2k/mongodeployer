package me.kahwah.bll.impl;

import me.kahwah.bll.PageService;
import me.kahwah.dao.PageDAO;
import me.kahwah.dao.models.Page;


/**
 * Created by rainmaker2k on 09/07/14.
 */
public class PageServiceImpl implements PageService {

    private PageDAO pageDao;

    public PageDAO getPageDao() {
        return pageDao;
    }

    public void setPageDao(PageDAO pageDao) {
        this.pageDao = pageDao;
    }

    @Override
    public void save(Page page) {
        pageDao.save(page);
    }
}
