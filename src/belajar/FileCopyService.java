package belajar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author RAMPA
 */
public class FileCopyService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fileAsal = new File("D:\\contoh.txt");
        File fileTujuan = new File("D:\\contoh1.txt");
        try {
            FileInputStream in = new FileInputStream(fileAsal);
            FileOutputStream out = new FileOutputStream(fileTujuan);
            
            byte[] buffer = new byte[1024];
            int panjang;
            while ((panjang = in.read(buffer)) > 0) {
                out.write(buffer, 0, panjang);
            }
            System.out.println("File berhasil disalin dari " + fileAsal.getAbsolutePath() + " ke " + fileTujuan.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.out.println("Gagal menyalin file: " + e.getMessage());
        } catch (IOException ex) {
            System.getLogger(FileCopyService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
