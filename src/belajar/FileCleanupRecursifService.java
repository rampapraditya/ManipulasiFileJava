package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileCleanupRecursifService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File target = new File("D:\\coba");
        hapusTotal(target);
    }
    
    public static void hapusTotal(File target) {
        if (target.isDirectory()) {
            File[] isi = target.listFiles();
            if (isi != null) {
                for (int i = 0; i < isi.length; i++) {
                    // Hapus isi di dalamnya dulu
                    hapusTotal(isi[i]);
                }
            }
        }
        
        // Hapus file atau folder kosong
        if (target.delete()) {
            System.out.println("Berhasil dihapus: " + target.getName());
        } else {
            System.out.println("Gagal menghapus: " + target.getName());
        }
    }
    
}
