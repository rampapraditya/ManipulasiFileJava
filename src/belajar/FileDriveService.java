package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileDriveService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File[] drives = File.listRoots();
        System.out.println("=== DAFTAR DRIVE ===");
        for (int i = 0; i < drives.length; i++) {
            System.out.println("Drive: " + drives[i]);
        }
    }
    
}
