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

public class sistemloginberlapis {
    
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Data akun terdaftar untuk simulasi
        String validUsername = "admin";
        String validPassword = "password123";
        
        int maxAttempts = 3;
        boolean loggedIn = false;

        System.out.println("=== Sistem Login ===");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Percobaan " + attempt + ":");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            // 1. Validasi syarat panjang Username (5-10 karakter)
            if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Username harus antara 5-10 karakter.\n");
                continue;
            }

            // 2. Validasi syarat Password (minimal 8 karakter dan mengandung angka)
            boolean hasDigit = false;
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                    break;
                }
            }

            if (password.length() < 8 || !hasDigit) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.\n");
                continue;
            }

            // 3. Pengecekan kecocokan kredensial akun
            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login berhasil!");
                loggedIn = true;
                break;
            } else {
                System.out.println("Login gagal! Password atau Username salah.\n");
            }
        }

        // Jika kuota percobaan habis dan belum berhasil login
        if (!loggedIn) {
            System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
        }
        
        scanner.close();
    }
}

}
