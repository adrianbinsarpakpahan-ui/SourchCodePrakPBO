/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s2_41425023;

/**
 *
 * @author User
 */
   
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg); // kirim data ke parent
    }

    // Implementasi wajib dari abstract method
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang
                + "' ke dalam kontainer tertutup pendingin.");
    }
}

