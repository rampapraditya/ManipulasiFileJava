package belajar;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author RAMPA
 */
public class FileWalkService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scanDriveModern("D:\\");
    }
    
    public static void scanDriveModern(String pathTujuan) {
        Path start = Paths.get(pathTujuan);

        try {
            Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    System.out.println("[FILE  ] " + file.toAbsolutePath());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    System.out.println("[FOLDER] " + dir.toAbsolutePath());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    // JIKA GAGAL AKSES (Access Denied), lewati saja, jangan biarkan program berhenti
                    System.err.println("[SKIP  ] Akses ditolak: " + file);
                    return FileVisitResult.SKIP_SUBTREE;
                }
            });
        } catch (IOException e) {
            System.err.println("Gagal total: " + e.getMessage());
        }
    }
}
