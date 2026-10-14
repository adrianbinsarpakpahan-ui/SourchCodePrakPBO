/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s2_41425023;

/**
 *
 * @author User
 */
public class MesinTarif {
    
    // Kota asal pengiriman (encapsulation: private)
    private String kotaAsal;

    // Constructor untuk mengisi kota asal
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Overload 1: ongkir dasar berdasarkan berat saja (Rp 10.000 / Kg)
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Overload 2: ongkir + asuransi 1% dari nilai barang
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Overload 3: ongkir dengan opsi express (tambahan Rp 20.000)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000; // biaya prioritas kilat
        }
        return total;
    }

    // Getter kota asal
    public String getKotaAsal() {
        return kotaAsal;
    }
}

