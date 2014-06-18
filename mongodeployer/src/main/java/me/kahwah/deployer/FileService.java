package me.kahwah.deployer;

import java.io.InputStream;

/**
 * Created by rainmaker2k on 13/06/14.
 */
public interface FileService {

    String extractToWorkDir(String zipPath);

    InputStream getFile(String path);
}
