package me.kahwah.deployer.impl;

import me.kahwah.deployer.DateFormatTransformer;
import me.kahwah.deployer.FileService;
import me.kahwah.deployer.PackageService;
import me.kahwah.deployer.models.InstructionSet;
import me.kahwah.deployer.models.MetaData;
import me.kahwah.deployer.models.Section;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.CamelCaseStyle;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;
import org.simpleframework.xml.transform.RegistryMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by rainmaker2k on 18/06/14.
 */
public class PackageServiceImpl implements PackageService {

    private static Logger log = LoggerFactory.getLogger(PackageServiceImpl.class);

    private FileService fileService;

    @Override
    public InstructionSet createPackageInstructions(String packageLocation) {

        Serializer serializer = getSerializer();

        Path instructionsFile = Paths.get(packageLocation, "instructions.xml");
        InputStream is = fileService.getFile(instructionsFile.toString());
        try {
            return serializer.read(InstructionSet.class, is);
        } catch (Exception e) {
            log.error("Could not deserialize instructions", e);
        }

        return null;
    }

    @Override
    public void processInstructions(InstructionSet instructionSet) {

    }

    @Override
    public List getMetaData(MetaData metaData, String extractedDir) {
        return null;
    }

    @Override
    public List getSectionItems(Section section, String extractedDir) {
        return null;
    }

    private Serializer getSerializer() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        RegistryMatcher m = new RegistryMatcher();
        m.bind(Date.class, new DateFormatTransformer(dateFormat));

        Style style = new CamelCaseStyle();
        Format format = new Format(style);
        return new Persister(m, format);
    }

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }
}
