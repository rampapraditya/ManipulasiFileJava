package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileCleanupService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File target = new File("D:\\coba.txt");
        if (target.exists()) {
            boolean status = target.delete();
            if (status) {
                System.out.println("Terhapus");
            } else {
                System.out.println("Gagal terhapus");
            }
        }
        
        File target1 = new File("D:\\coba");
        if (target1.exists()) {
            boolean status = target1.delete();
            if (status) {
                System.out.println("Terhapus");
            } else {
                System.out.println("Gagal terhapus");
            }
        }
    }

}
