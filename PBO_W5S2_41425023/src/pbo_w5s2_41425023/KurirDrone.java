/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s2_41425023;

 
    
class KurirDrone extends KurirReguler {
    private String idDrone; // atribut khusus drone

    public KurirDrone(String nama, String idDrone) {
        super(nama);          // panggil constructor parent
        this.idDrone = idDrone;
    }

    // @Override memastikan method ini benar-benar menimpa method parent
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama
                + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }

