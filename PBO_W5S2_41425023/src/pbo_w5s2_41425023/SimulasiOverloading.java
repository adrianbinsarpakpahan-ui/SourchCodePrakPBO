/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s2_41425023;

/**
 *
 * @author User
 */
public class SimulasiOverloading {
    
    public static void main(String[] args) {
        // Membuat objek MesinTarif dengan kota asal Medan
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        // 1 parameter (double) -> overload 1
        System.out.println("Ongkir Biasa (2.0 Kg)           : Rp " + tarif.hitungOngkir(2.0));
        // 2 parameter (double, double) -> overload 2
        System.out.println("Ongkir + Asuransi (Barang 5Jt)  : Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        // 2 parameter (double, boolean) -> overload 3
        System.out.println("Ongkir Express (2.0 Kg)         : Rp " + tarif.hitungOngkir(2.0, true));
    }
}

