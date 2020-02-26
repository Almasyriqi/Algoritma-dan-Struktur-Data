/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class MainNilaiDC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Program Menghitung Nilai Total Mahasiswa");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        System.out.println("=====================================================");

        NilaiAlgoritmaDC[] na = new NilaiAlgoritmaDC[jumlah];

        for (int i = 0; i < jumlah; i++) {
            na[i] = new NilaiAlgoritmaDC();
            sc.nextLine();
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            na[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan nilai Tugas\t: ");
            na[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan nilai Kuis\t: ");
            na[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan nilai UTS\t: ");
            na[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan nilai UAS\t: ");
            na[i].nilaiUAS = sc.nextInt();
            System.out.println("=====================================================");
        }

        Rata2DC rt = new Rata2DC();
        System.out.println("Nilai Total Mata Kuliah Algoritama");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama Mahasiswa ke-" + (i + 1) + ": " + na[i].namaMhs);
            System.out.println("Nilai Total : " + na[i].hitungTotalNilai(jumlah, na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS));
            rt.total += na[i].hitungTotalNilai(jumlah, na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS);
        }
        System.out.println("=====================================================");
        System.out.println("Rata-rata nilai total seluruh mahasiswa : " + rt.hitungRata(jumlah));
    }

}
