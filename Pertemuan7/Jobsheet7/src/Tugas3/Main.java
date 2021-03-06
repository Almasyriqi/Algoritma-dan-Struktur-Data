/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Main {

    public static void main(String[] args) {
        int[] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Search pencarian = new Search(data, 10);
        MergeSorting ms = new MergeSorting();

        System.out.println("Pencarian Nilai Array Terbesar Menggunakan Binary Search");
        System.out.println("===========================================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("===========================================================");

        System.out.println("Sorting dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("===========================================================");

        System.out.println("Nilai Elemen Array Terbesar : " + pencarian.maks(data));
        int cari = pencarian.maks(data);
        System.out.println("Jumlah nilai terbesar : " + pencarian.jumlahTerbesar(cari, data));
        int posisi = pencarian.FindBinarySearch(cari, data, 0, data.length - 1);
        for (int i = 0; i < pencarian.terbesar; i++) {
            if (i > 0) {
                pencarian.Tampilposisi(cari, posisi + 1);
                posisi++;
            } else {
                pencarian.Tampilposisi(cari, posisi);
            }
        }
    }
}
