package B;


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

public class hitungnilairataratanilaiujian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int c = input.nextInt();

        System.out.println("Tambah: " + (double) (a + b + c))/3;
    }
}



