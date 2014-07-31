package me.kahwah.deployer.impl;

import me.kahwah.bll.BinaryService;
import me.kahwah.dao.models.Binary;
import me.kahwah.dao.models.Page;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.Processor;
import me.kahwah.deployer.models.Section;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by rainmaker2k on 31/07/14.
 */
public class BinaryProcessorImpl implements Processor<Section> {


    private static Logger log = LoggerFactory.getLogger(BinaryProcessorImpl.class);

    private PackageService packageService;
    private BinaryService binaryService;

    @Override
    public void process(Section section, String extractedDir) {


        List<Binary> binaries = packageService.getSectionItems(section, extractedDir);

        for (Binary binary : binaries) {
            binaryService.save(binary);
        }
    }

    public void setBinaryService(BinaryService binaryService) {
        this.binaryService = binaryService;
    }

    public void setPackageService(PackageService packageService) {
        this.packageService = packageService;
    }
}
