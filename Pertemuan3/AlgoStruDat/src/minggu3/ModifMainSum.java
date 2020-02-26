/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 * Nama : M.Syifa'ul Ikrom A Kelas : TI 1F NIM : 1941720057
 */
public class ModifMainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        ModifSum ms = new ModifSum();
        System.out.print("Masukkan jumlah perusahaan : ");
        ms.jumlah = sc.nextInt();

        ModifSum[] sm = new ModifSum[ms.jumlah];

        for (int i = 0; i < ms.jumlah; i++) {
            sm[i] = new ModifSum();
            System.out.println("===============================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            sm[i].elemen = sc.nextInt();
            ModifSum[][] ts = new ModifSum[ms.jumlah][sm[i].elemen];
            for (int j = 0; j < sm[i].elemen; j++) {
                ts[i][j] = new ModifSum();
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                ts[i][j].keuntungan = sc.nextDouble();
            }
        }

        System.out.println("===============================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < ms.jumlah; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            ModifSum[][] ts = new ModifSum[ms.jumlah][sm[i].elemen];
            for (int j = 0; j < sm[i].elemen; j++) {
                sm[i] = new ModifSum();
                ts[i][j] = new ModifSum();
                System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
            }
        }

//        System.out.println("===============================================================");
//        System.out.println("Algoritma Divide and Conquer");
//        System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f" + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
//        System.out.println();
    }
}
