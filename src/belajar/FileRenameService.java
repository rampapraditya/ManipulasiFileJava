package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileRenameService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File asal = new File("D:\\coba.txt");
        File tujuan = new File("D:\\coba1.txt");

        if (asal.exists()) {
            if (asal.renameTo(tujuan)) {
                System.out.println("Berhasil diubah");
            } else {
                System.out.println("Gagal mengubah.");
            }
        } else {
            System.out.println("File asal tidak ditemukan.");
        }
    }

}
