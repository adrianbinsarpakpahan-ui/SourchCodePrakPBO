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

public class programvalidasi {

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String cardNumber = scanner.nextLine();

        // Cek apakah format kartu valid
        String regex = "^[456]\\d{3}(-?\\d{4}){3}$";

        if (cardNumber.matches(regex)) {
            System.out.println("Nomor kartu valid.");
        } else {
            System.out.println("Nomor kartu tidak valid!");

            // Cek awalan kartu
            if (!cardNumber.startsWith("4") &&
                !cardNumber.startsWith("5") &&
                !cardNumber.startsWith("6")) {
                System.out.println("Harus dimulai dengan 4, 5, atau 6.");
            }
        }

        scanner.close();
    }
}
}
