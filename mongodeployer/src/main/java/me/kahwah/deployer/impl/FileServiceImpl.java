package me.kahwah.deployer.impl;

import me.kahwah.deployer.FileService;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by rainmaker2k on 13/06/14.
 */
public class FileServiceImpl implements FileService {

    private static Logger log = LoggerFactory.getLogger(DeployerImpl.class);

    private XMLConfiguration config;

    @Override
    public String extractToWorkDir(String zipPath) {

        String workdir = config.getString("workDir");

        Path workingDir = FileSystems.getDefault().getPath(workdir);

        try {
            ZipFile zipFile = new ZipFile(zipPath);

            zipFile.extractAll(workingDir.toAbsolutePath().toString());

            String baseName = FilenameUtils.getBaseName(zipPath);
            String fileWithoutExt = FilenameUtils.removeExtension(baseName);
            Path path = Paths.get(workingDir.toAbsolutePath().toString(), fileWithoutExt + ".Content");

            return path.toString();

        } catch (ZipException e) {
            log.warn("Could not unzip " + zipPath, e);
        }

        return null;
    }

    @Override
    public InputStream getFile(String path) {
        try {
            return new FileInputStream(path);
        } catch (FileNotFoundException e) {
            log.debug(String.format("Could not find file at path %s", path));
        }

        return null;
    }

    public XMLConfiguration getConfig() {
        return config;
    }

    public void setConfig(XMLConfiguration config) {
        this.config = config;
    }

}
