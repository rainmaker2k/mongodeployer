package me.kahwah.deployer.impl;

import me.kahwah.bll.PageService;
import me.kahwah.dao.models.Page;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.Processor;
import me.kahwah.deployer.models.Section;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by rainmaker2k on 10-06-14.
 */
public class PageProcessorImpl implements Processor<Section> {

    private static Logger log = LoggerFactory.getLogger(PageProcessorImpl.class);

    private PackageService packageService;
    private PageService pageService;

    @Override
    public void process(Section section, String extractedDir) {

        List<Page> pages = packageService.getSectionItems(section, extractedDir);

        for (Page page : pages) {
            pageService.save(page);
        }
    }

    public PackageService getPackageService() {
        return packageService;
    }

    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }

    public void setPageService(PageService pageService) {
        this.pageService = pageService;
    }
}
