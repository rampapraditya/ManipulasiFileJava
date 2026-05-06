package belajar;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author RAMPA
 */
public class FileWatcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // 1. Inisialisasi WatchService
            WatchService watchService = FileSystems.getDefault().newWatchService();
            Path path = Paths.get("D:\\");
            
            // 2. Daftarkan event yang ingin dipantau
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);
            
            System.out.println("Sedang memantau folder: " + path);
            
            // 3. Loop untuk menangkap perubahan
            WatchKey key;
            try {
                while ((key = watchService.take()) != null) {
                    for (WatchEvent<?> event : key.pollEvents()) {
                        System.out.println("Kejadian: " + event.kind() + " pada file: " + event.context());
                    }
                    key.reset();
                }
            } catch (InterruptedException ex) {
                System.getLogger(FileWatcher.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        } catch (IOException ex) {
            System.getLogger(FileWatcher.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
