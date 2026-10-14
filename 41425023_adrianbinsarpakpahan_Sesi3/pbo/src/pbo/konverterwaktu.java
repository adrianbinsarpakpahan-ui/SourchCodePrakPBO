/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
/*
NIM: 41425023
Nama: adrian binsar pakpahan 
*/

import java.util.Scanner;

public class konverterwaktu {
 
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (choice == 1) {
            // Konversi Detik ke HH:MM:SS
            System.out.print("Masukkan jumlah detik: ");
            int totalSeconds = scanner.nextInt();
            
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;
            
            System.out.printf("Hasil: %02d:%02d:%02d\n", hours, minutes, seconds);
            
        } else if (choice == 2) {
            // Konversi HH:MM:SS ke Detik
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String timeStr = scanner.nextLine();
            
            // Memisah string berdasarkan tanda titik dua (:)
            String[] parts = timeStr.split(":");
            if (parts.length == 3) {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                int seconds = Integer.parseInt(parts[2]);
                
                int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
                System.out.println("Hasil: " + totalSeconds + " detik");
            } else {
                System.out.println("Format waktu salah! Gunakan format HH:MM:SS");
            }
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
        
        scanner.close();
    }
}

}
