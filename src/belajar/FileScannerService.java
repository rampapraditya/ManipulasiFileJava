package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileScannerService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File direktori = new File("C:\\");
        File[] daftarItem = direktori.listFiles();
        for (int i = 0; i < daftarItem.length; i++) {
            File item = daftarItem[i];
            if (item.isDirectory()) {
                System.out.println("[FOLDER] " + item.getAbsolutePath());
            } else {
                System.out.println("[FILE  ] " + item.getName());
            }
        }
    }
    
}
