/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfdc;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class minMax {
    public int nilaiArray; 
    
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, Maxmin hasil) {
        int indeks_tengah;
        Maxmin hasil1 = new Maxmin(); // O(1)
        Maxmin hasil2 = new Maxmin(); // O(1)
        
        if (indeks_awal == indeks_akhir) { // O(1)
            hasil.minimum = hasil.maximum = arr[indeks_awal]; // O(1)
        } else if (indeks_akhir - indeks_awal == 1) { // O(1)
            if (arr[indeks_awal] > arr[indeks_akhir]) { // O(1)
                hasil.minimum = arr[indeks_akhir]; // O(1)
                hasil.maximum = arr[indeks_awal]; // O(1)
            } else {
                hasil.minimum = arr[indeks_awal]; // O(1)
                hasil.maximum = arr[indeks_akhir]; // O(1)
            }
        } else {
            indeks_tengah = (indeks_awal + indeks_akhir)/2; // O(1)
            max_min(arr, indeks_awal, indeks_tengah, hasil1); // O(K^n)
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2); // O(K^n)
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum; // O(1+1) 
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum; // O(1+1)
        }
        
        // Notasi Big O
        // O(1+1+1+1+1+1+1+1+1+1+1+K^n+K^n+1+1+1+1)
        // O(11+2K^n+4)
        // O(15+2K^n)
        // O(2K^n)
        // O(K^n)
    }
}
