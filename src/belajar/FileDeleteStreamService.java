/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

/**
 *
 * @author RAMPA
 */
public class FileDeleteStreamService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hapusDenganStream("D:\\contoh");
    }

    public static void hapusDenganStream(String pathTarget) {
        Path path = Paths.get(pathTarget);
        try {
            Files.walk(path)
                    .sorted(Comparator.reverseOrder()) // Penting: hapus isi dulu baru foldernya
                    .forEach(p -> {
                        try {
                            Files.delete(p);
                            System.out.println("Terhapus: " + p);
                        } catch (IOException e) {
                            System.err.println("Gagal hapus item: " + p + " -> " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.err.println("Gagal memulai proses hapus: " + e.getMessage());
        }
    }
}
