package belajar;

import java.io.File;

/**
 *
 * @author RAMPA
 */
public class FileSizeService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("D:\\Jawaban Cyber.docx");
        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            double kilobytes = (bytes / 1024.0);
            double megabytes = (kilobytes / 1024.0);

            System.out.println("Ukuran File: ");
            System.out.println("- " + bytes + " Bytes");
            System.out.println("- " + String.format("%.2f", kilobytes) + " KB");
            System.out.println("- " + String.format("%.2f", megabytes) + " MB");
        } else {
            System.out.println("File tidak ditemukan atau bukan merupakan file.");
        }
    }
    
}
