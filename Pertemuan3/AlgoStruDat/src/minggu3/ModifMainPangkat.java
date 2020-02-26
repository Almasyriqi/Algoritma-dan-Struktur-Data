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
public class ModifMainPangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("\t\tMenu Program Pangkat");
        System.out.println("--------------------------------------");
        System.out.println("1. Algoritma Brute Force");
        System.out.println("2. Algoritma Divide and Conquer");
        System.out.println("--------------------------------------");
        System.out.print("Pilih menu : ");
        int pilih = sc.nextInt();

        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        ModifPangkat[] png = new ModifPangkat[elemen];
        int temp1[] = new int[elemen];
        int temp2[] = new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            temp1[i] = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            temp2[i] = sc.nextInt();
        }
        for (int i = 0; i < elemen; i++) {
            png[i] = new ModifPangkat(temp1[i], temp2[i]);
        }
        switch (pilih) {
            case 1:
                System.out.println("=====================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                System.out.println("=====================================================");
                break;
            case 2:
                System.out.println("=====================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                System.out.println("=====================================================");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
