/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Waktu Eksekusi: " + String.valueOf(elapsedTime) + " milidetik");
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        long waktuMulai = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        long waktuSelesai = System.currentTimeMillis();
        long selangWaktu = waktuSelesai - waktuMulai;
        System.out.println("Waktu Eksekusi: " + String.valueOf(selangWaktu) + " milidetik");
        System.out.println("=====================================================");
    }
}
