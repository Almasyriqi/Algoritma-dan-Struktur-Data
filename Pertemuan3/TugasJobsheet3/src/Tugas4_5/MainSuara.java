/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4_5;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainSuara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PemilihanSuara[] ps = new PemilihanSuara[4];
        ps[0] = new PemilihanSuara("Haris");
        ps[1] = new PemilihanSuara("Dian");
        ps[2] = new PemilihanSuara("Bisma");
        ps[3] = new PemilihanSuara("Rani");
        
        System.out.println("\tProgram Pemilihan Ketua BEM Tahun 2020");
        System.out.println("=====================================================");
        System.out.println("Nomor dan Nama Kandidat: ");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "." + ps[i].namaKandidat);
        }
        Suara s1 = new Suara();
        System.out.println("Note: pemilihan kandidat menggunakan nomor kandidat");
        System.out.println("=====================================================");
        System.out.print("Total suara masuk : ");
        s1.total = sc.nextInt();
        
        s1.suaraDipilih = new int[s1.total];
        for (int i = 0; i < s1.total; i++) {
            System.out.print("Pilihan suara ke-" + (i+1) + ": ");
            s1.suaraDipilih[i] = sc.nextInt();
        }
        System.out.println("Coba = " + s1.suaraTerbanyak(s1.suaraDipilih, 0, s1.total-1));
    }
}
