package me.kahwah.deployer;

import me.kahwah.deployer.models.InstructionSet;
import me.kahwah.deployer.models.MetaData;
import me.kahwah.deployer.models.Section;

import java.util.List;

/**
 * Created by rainmaker2k on 14-6-2014.
 */
public interface PackageService {

    InstructionSet createPackageInstructions(String packageLocation);

    void processInstructions(InstructionSet instructionSet);

    List getMetaData(MetaData metaData, String extractedDir);

    List getSectionItems(Section section, String extractedDir);

}
