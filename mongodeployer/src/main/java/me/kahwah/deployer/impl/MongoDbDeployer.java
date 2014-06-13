package me.kahwah.deployer.impl;

import me.kahwah.dao.KeywordDAO;
import me.kahwah.dao.PageDAO;
import me.kahwah.deployer.Deployer;
import me.kahwah.deployer.FileService;
import me.kahwah.deployer.Processor;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by rainmaker2k on 23/05/14.
 */

public class MongoDbDeployer implements Deployer {

    private static Logger log = LoggerFactory.getLogger(MongoDbDeployer.class);

    private PageDAO pageDao;
    private KeywordDAO keywordDao;
    private XMLConfiguration config;
    private List<Processor> processors;
    private FileService fileService;

    public void deploy(String zipPath) {

        String extractedDir = fileService.extractToWorkDir(zipPath);


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

    public XMLConfiguration getConfig() {
        return config;
    }

    public void setConfig(XMLConfiguration config) {
        this.config = config;
    }

    public List<Processor> getProcessors() {
        return processors;
    }

    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }
}
