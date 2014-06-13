package me.kahwah.deployer;

import me.kahwah.dao.KeywordDAO;
import me.kahwah.dao.PageDAO;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by rainmaker2k on 23/05/14.
 */

public class Deployer {

    private static Logger log = LoggerFactory.getLogger(Deployer.class);

    private PageDAO pageDao;
    private KeywordDAO keywordDao;
    private XMLConfiguration config;
    private List<Processor> processors;

    public void deploy(Path zippackage) {

        Path workingDir = FileSystems.getDefault().getPath("work");

        try {
            //Path workingSubDir = Files.createDirectory(workingDir.resolve(zippackage.getFileName().toString()));

            ZipFile zipFile = new ZipFile(zippackage.toString());

            zipFile.extractAll(workingDir.toAbsolutePath().toString());

        } catch (ZipException e) {
            log.warn("Could not unzip " + zippackage.toString(), e);
        }
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
}
