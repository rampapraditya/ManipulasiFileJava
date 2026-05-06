package belajar;

import java.io.File;
import java.util.Date;

/**
 *
 * @author RAMPA
 */
public class FileMetadataService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("D:\\belajar docker.txt");
        if (file.exists()) {
            long milidetik = file.lastModified();
            Date tanggal = new Date(milidetik);
            System.out.println("Nama File  : " + file.getName());
            System.out.println("Modifikasi : " + tanggal);
        } else {
            System.out.println("File tidak ditemukan!");
        }
    }

}
