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

public class pengolahandaftarbelanja {
    

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cart = new String[100]; // Kapasitas maksimal 100 item
        int itemCount = 0;
        int choice;

        do {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer new line

            switch (choice) {
                case 1:
                    // Tambah Item
                    if (itemCount < cart.length) {
                        System.out.print("Masukkan item: ");
                        String newItem = scanner.nextLine();
                        cart[itemCount] = newItem;
                        itemCount++;
                        System.out.println(newItem + " berhasil ditambahkan!");
                    } else {
                        System.out.println("Keranjang sudah penuh!");
                    }
                    break;

                case 2:
                    // Hapus Item berdasarkan posisi (1-based index)
                    if (itemCount == 0) {
                        System.out.println("Daftar belanja kosong!");
                    } else {
                        System.out.print("Hapus item pada posisi: ");
                        int pos = scanner.nextInt();
                        if (pos > 0 && pos <= itemCount) {
                            String removedItem = cart[pos - 1];
                            // Menggeser sisa elemen array ke kiri setelah dihapus
                            for (int i = pos - 1; i < itemCount - 1; i++) {
                                cart[i] = cart[i + 1];
                            }
                            cart[itemCount - 1] = null; // Menghapus jejak elemen terakhir
                            itemCount--;
                            System.out.println(removedItem + " berhasil dihapus!");
                        } else {
                            System.out.println("Posisi tidak valid!");
                        }
                    }
                    break;

                case 3:
                    // Menampilkan Semua Item
                    if (itemCount == 0) {
                        System.out.println("Daftar belanja kosong.");
                    } else {
                        System.out.println("Daftar belanja:");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println((i + 1) + ". " + cart[i]);
                        }
                    }
                    break;

                case 4:
                    // Mencari Item di dalam array
                    System.out.print("Cari item: ");
                    String searchKey = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (cart[i].equalsIgnoreCase(searchKey)) {
                            System.out.println(searchKey + " ditemukan pada posisi " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(searchKey + " tidak ditemukan dalam daftar.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);

        scanner.close();
    }
}

}
