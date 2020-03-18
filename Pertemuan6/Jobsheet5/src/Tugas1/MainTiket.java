/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class MainTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DaftarTiket data = new DaftarTiket();
        int jmlMaskapai = 5;
        
        System.out.println("Daftar Harga Tiket Pesawat Terbang");
        for (int i = 0; i < jmlMaskapai; i++) {
            System.out.println("============================================");
            System.out.print("Nama Maskapai : ");
            String nama = sc1.nextLine();
            System.out.print("Harga Tiket : Rp ");
            float har = sc.nextFloat();
            System.out.print("Jumlah Transit : ");
            int jml = sc.nextInt();
            System.out.print("Waktu Keberangkatan : pukul ");
            int jm = sc.nextInt();
            
            Tiket T = new Tiket(nama,har,jml,jm);
            data.tambah(T);
        }
        
        System.out.println("Daftar Harga Tiket Sebelum Sorting : ");
        data.tampil();
        System.out.println("Daftar Harga Tiket Setelah Sorting Bubble Sort : ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Daftar Harga Tiket Setelah Sorting Selection Sort : ");
        data.selectionSort();
        data.tampil();
    }
}
