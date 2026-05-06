package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileScannerRecursifService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File path = new File("C:\\");
        listIsiFolder(path);
    }
    
    public static void listIsiFolder(File direktori) {
        File[] daftarItem = direktori.listFiles();

        if (daftarItem != null) {
            for (int i = 0; i < daftarItem.length; i++) {
                File item = daftarItem[i];
                if (item.isDirectory()) {
                    System.out.println("[FOLDER] " + item.getAbsolutePath());
                    listIsiFolder(item);
                } else {
                    System.out.println("[FILE  ] " + item.getName());
                }
            }
        }
    }
}
