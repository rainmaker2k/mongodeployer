package me.kahwah.deployer.impl;

import me.kahwah.dao.KeywordDAO;
import me.kahwah.dao.PageDAO;
import me.kahwah.deployer.Deployer;
import me.kahwah.deployer.FileService;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.Processor;
import me.kahwah.deployer.models.InstructionSet;
import me.kahwah.deployer.models.MetaData;
import me.kahwah.deployer.models.Section;
import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by rainmaker2k on 23/05/14.
 */

public class DeployerImpl implements Deployer {

    private static Logger log = LoggerFactory.getLogger(DeployerImpl.class);

    private Map<String, Processor<Section>> sectionProcessors;
    private Map<String, Processor<MetaData>> metaDataProcessors;
    private FileService fileService;
    private PackageService packageService;

    public void deploy(String zipPath) {

        try {
            String extractedDir = fileService.extractToWorkDir(zipPath);

            if (extractedDir != null) {
                InstructionSet instructionSet = packageService.createPackageInstructions(extractedDir);

                processInstructions(instructionSet, extractedDir);

                fileService.cleanupExtractedDir(extractedDir);
            }
        } catch (Exception ex) {
             log.error("Could not deploy", ex);
        }

    }

    private void processInstructions(InstructionSet instructionSet, String extractedDir) {
        List<Section> sectionList = instructionSet.getSections();

        for (Section section : sectionList) {
            String type = section.getType();
            Processor<Section> processor = sectionProcessors.get(type);

            if (processor != null) {
                processor.process(section, extractedDir);
            }
        }

        List<MetaData> metaDataList = instructionSet.getMetaData();
        for (MetaData metaData : metaDataList) {
            String type = metaData.getType();
            Processor<MetaData> metaDataProcessor = metaDataProcessors.get(type);

            if (metaDataProcessor != null) {
                metaDataProcessor.process(metaData, extractedDir);
            }
        }


    }

    public Map<String, Processor<Section>> getSectionProcessors() {
        return sectionProcessors;
    }

    public void setSectionProcessors(Map<String, Processor<Section>> sectionProcessors) {
        this.sectionProcessors = sectionProcessors;
    }

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }

    public PackageService getPackageService() {
        return packageService;
    }

    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }

    public Map<String, Processor<MetaData>> getMetaDataProcessors() {
        return metaDataProcessors;
    }

    public void setMetaDataProcessors(Map<String, Processor<MetaData>> metaDataProcessors) {
        this.metaDataProcessors = metaDataProcessors;
    }
}
