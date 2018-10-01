/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan24.perbandinganduanilai;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk membandingkan dua buah
 * nilai
 */
public class PBO210117049Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiSatu;
        int nilaiDua;
        String ulangi;

        Scanner scan = new Scanner(System.in);

        System.out.println("======Program Perbandingan Nilai======");
        do {
            System.out.print("Masukkan Nilai Pertama : ");
            nilaiSatu = scan.nextInt();
            System.out.print("Masukkkan Nilai Kedua : ");
            nilaiDua = scan.nextInt();

            System.out.print("Hasil : ");
            if (nilaiSatu > nilaiDua) {
                System.out.println(nilaiSatu + " Lebih besar dari " + nilaiDua);
            } else if (nilaiSatu == nilaiDua) {
                System.out.println(nilaiSatu + " sama dengan " + nilaiDua);
            } else if (nilaiSatu < nilaiDua) {
                System.out.println(nilaiSatu + " Lebih kecil dari " + nilaiDua);
            }
            System.out.println("");
            System.out.print("Ulangi aktivitas diatas ? (Ya/Tidak) : ");
            ulangi = scan.next();
        } while (ulangi.equals("Ya"));

    }

}
