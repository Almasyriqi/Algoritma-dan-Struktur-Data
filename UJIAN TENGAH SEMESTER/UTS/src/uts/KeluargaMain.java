/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class KeluargaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("UTS Program Pencarian Data Keluarga Berdasarkan Umur");
        System.out.println("===========================================================");
        System.out.print("Jumlah data : ");
        int jml = sc.nextInt();
        
        CariKeluarga pencarian = new CariKeluarga(jml);
        
        for (int i = 0; i < pencarian.jmlData; i++) {
            System.out.print("Nama \t: ");
            String nama = sc2.nextLine();
            System.out.print("Posisi \t: ");
            String posisi = sc2.nextLine();
            System.out.print("Umur \t: ");
            int umur = sc.nextInt();
            System.out.println("===========================================================");
            
            Keluarga K = new Keluarga(nama, posisi, umur);
            pencarian.tambah(K);
        }
        
        System.out.print("Masukkan data umur yang ingin dicari : ");
        int cari = sc.nextInt();
        System.out.println("Sorting data dengan selection sort");
        pencarian.selectionSort();
        System.out.println("===========================================================");
        pencarian.tampil();
        
        int pos = pencarian.FindBinarySearch(cari, 0, pencarian.jmlData-1);
        pencarian.Tampilposisi(cari, pos);
    }
}
