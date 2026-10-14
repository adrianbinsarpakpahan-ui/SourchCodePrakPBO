/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s2_41425023;

/**
 *
 * @author User
 */

    
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Variabel bertipe parent, objek asli KurirReguler
        KurirReguler k1 = new KurirReguler("Budi");
        // Variabel bertipe parent, objek asli KurirDrone (upcasting)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        k1.kirimBarang("Jl. Sudirman No. 10");   // versi parent (darat)
        k2.kirimBarang("Gedung Graha Lt. 5");    // versi child (udara)
    }
}

