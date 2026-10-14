/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s2_41425023;

/**
 *
 * @author User
 */
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor untuk diwariskan ke subclass lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method: sudah punya body, dipakai bersama oleh semua subclass
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method: tanpa body, WAJIB diimplementasikan subclass konkret
    public abstract void angkutBarang(String namaBarang);
}

