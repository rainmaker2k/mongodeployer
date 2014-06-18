package me.kahwah.deployer.impl;

import me.kahwah.deployer.Deployer;
import me.kahwah.deployer.DeployerService;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

/**
 * Created by rainmaker2k on 18/06/14.
 */
public class DeployerServiceImpl implements DeployerService {

    private Deployer deployer;

    @Override
    public void startService() {
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();

            WatchKey key;

            Path dir = FileSystems.getDefault().getPath("incoming");
            DirectoryStream<Path> files = Files.newDirectoryStream(dir);

            for (Path existingFile : files) {
                //File file = existingFile.toFile();
                if (!existingFile.toFile().isDirectory() && existingFile.toString().endsWith(".zip")) {

                    deployer.deploy(existingFile.toString());
                }

            }
            dir.register(watcher, ENTRY_CREATE);

            for (;;) {

                key = watcher.take();

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    if (kind == OVERFLOW) {
                        continue;
                    }

                    WatchEvent<Path> ev = (WatchEvent<Path>)event;
                    Path filename = ev.context();

                    Path child = dir.resolve(filename);
                    String mimetype = Files.probeContentType(child);
                    if (!"text/plain".equals(mimetype)) {
                        System.err.format("New file '%s'" +
                                " is not a plain text file.%n", filename);
                        continue;
                    }

                    System.out.println("File placed: " + filename);
                }

                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
