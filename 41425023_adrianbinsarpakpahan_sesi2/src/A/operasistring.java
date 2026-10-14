package A;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
    import java.util.Scanner;

public class operasistring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}




//*bagaimana jika nama yang diinput dengan lebih dari satu  spasi?Panjang string (nama.length()): Setiap spasi tambahan akan tetap dihitung sebagai 1 karakter.Jadi, panjang string totalnya akan bertambah sebanyak spasi yang diketik.Huruf pertama (ama.charAt(0)): Jika spasi tambahan tersebut berada di awal nama (misalnya: " Ahmad"), maka program akan mendeteksi spasi kosong ( ) sebagai huruf pertamany.Mengandung spasi (nama.contains(" ")): Hasilnya akan tetap ealam teks tersebut.//*