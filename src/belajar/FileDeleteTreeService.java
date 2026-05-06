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
public class FileDeleteTreeService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String folderSampah = "D:\\folder_test_hapus";
        hapusSampaiAkar(folderSampah);
    }
    
    public static void hapusSampaiAkar(String pathTarget) {
        Path path = Paths.get(pathTarget);
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                // 1. Hapus file-filenya dulu
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file);
                    System.out.println("File Dihapus: " + file);
                    return FileVisitResult.CONTINUE;
                }

                // 2. Hapus foldernya setelah isinya kosong
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    System.out.println("Folder Dihapus: " + dir);
                    return FileVisitResult.CONTINUE;
                }

                // 3. Jika gagal akses/hapus, jangan berhenti
                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    System.err.println("Gagal menghapus: " + file + " (Akses Ditolak/Sedang Dipakai)");
                    return FileVisitResult.CONTINUE; 
                }
            });
        } catch (IOException e) {
            System.err.println("Proses hapus gagal total: " + e.getMessage());
        }
    }
}
