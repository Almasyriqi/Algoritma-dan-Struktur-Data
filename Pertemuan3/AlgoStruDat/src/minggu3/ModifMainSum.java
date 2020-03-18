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
public class ModifMainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        TambahanSum ms = new TambahanSum();
        System.out.print("Masukkan jumlah perusahaan : ");
        ms.jumlah = sc.nextInt();

        TambahanSum[] s = new TambahanSum[ms.jumlah];
        double array[][] = new double[30][30];

        for (int i = 0; i < ms.jumlah; i++) {
            s[i] = new TambahanSum();
            System.out.println("===============================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            s[i].elemen = sc.nextInt();
            ModifSum[][] ts = new ModifSum[ms.jumlah][s[i].elemen];
            for (int j = 0; j < s[i].elemen; j++) {
                ts[i][j] = new ModifSum();
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                ts[i][j].keuntungan = sc.nextDouble();
                array[i][j] = ts[i][j].keuntungan;
            }
        }

        double[] total = new double[30];
        System.out.println("===============================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < ms.jumlah; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            for (int j = 0; j < s[i].elemen; j++) {
                total[i] += array[i][j];
            }
            System.out.printf("Total keuntungan perusahaan selama " + s[i].elemen + " bulan adalah = %.2f", total[i]);
            System.out.println();
        }

        double[] total2 = new double[30];
        System.out.println("===============================================================");
        System.out.println("Algoritma Divide and Conquer");
        for (int i = 0; i < ms.jumlah; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            for (int j = 0; j < s[i].elemen; j++) {
                total2[i] += array[i][j];
            }
            System.out.printf("Total keuntungan perusahaan selama " + s[i].elemen + " bulan adalah = %.2f", s[i].totalDC(total2, 0, s[i].elemen-1));
            System.out.println();
            total2[i] = 0;
        }

    }
}
