package me.kahwah.deployer;

import me.kahwah.deployer.models.InstructionSet;

/**
 * Created by rainmaker2k on 14-6-2014.
 */
public interface PackageService {

    InstructionSet createPackageInstructions(String packageLocation);
}
