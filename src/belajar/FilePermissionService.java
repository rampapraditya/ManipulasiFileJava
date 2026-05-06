package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FilePermissionService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("D:\\belajar docker.txt");
        if (file.exists()) {
            System.out.println("Status File: " + file.getName());
            System.out.println("Tersembunyi? " + file.isHidden());
            System.out.println("Bisa Dibaca? " + file.canRead());
            System.out.println("Bisa Ditulis? " + file.canWrite());
            System.out.println("Apakah ini File? " + file.isFile());
            System.out.println("Apakah ini Folder? " + file.isDirectory());
        }
    }

}
