package belajar;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author RAMPA
 */
public class FileCreateService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder = new File("D:\\coba");
        if (folder.mkdirs()) {
            System.out.println("Folder berhasil dibuat");
        } else {
            System.out.println("Folder sudah ada atau gagal dibuat.");
        }

        File file = new File("D:\\coba.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File berhasil dibuat");
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

}
