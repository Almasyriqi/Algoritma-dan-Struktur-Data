/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // O(1)
        System.out.println("====================================================="); // O(1)
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : "); // O(1)
        int elemen = sc.nextInt(); // O(1)

        Faktorial[] fk = new Faktorial[elemen]; // O(1)
        for (int i = 0; i < elemen; i++) { // O(n)
            fk[i] = new Faktorial(); // O(1)
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : "); // O(1)
            fk[i].nilai = sc.nextInt(); // O(1)
        }

        System.out.println("====================================================="); // O(1)
        System.out.println("Hasil Faktorial dengan Brute Force"); // O(1)
        long startTime = System.currentTimeMillis(); // O(1)
        for (int i = 0; i < elemen; i++) { // O(n!)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai)); // O(1)
        }
        long endTime = System.currentTimeMillis(); // O(1)
        long elapsedTime = endTime - startTime; // O(1)
        System.out.println("Waktu Eksekusi: " + String.valueOf(elapsedTime) + " milidetik"); // O(1)
        // Notasi Big O Algoritma Brute Force
        // O(1+1+1+1+1+n*1*1*1+1+1+n!*1+1+1+1)
        // O(5+n+2+n!+3)
        // O(10+n+n!)
        // O(n+n!)
        // O(n!)
        
        System.out.println("====================================================="); // O(1)
        System.out.println("Hasil Faktorial dengan Divide and Conquer"); // O(1)
        long waktuMulai = System.currentTimeMillis(); // O(1)
        for (int i = 0; i < elemen; i++) { // O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai)); // O(K^n)
        }
        long waktuSelesai = System.currentTimeMillis(); // O(1)
        long selangWaktu = waktuSelesai - waktuMulai; // O(1)
        System.out.println("Waktu Eksekusi: " + String.valueOf(selangWaktu) + " milidetik"); // O(1)
        System.out.println("====================================================="); // O(1)
        // Notasi Big O Algoritma Divide Conquer
        // O(1+1+1+1+1+n*1*1*1+1+1+n*K^n+1+1+1+1)
        // O(5+n+2+n*K^n+4)
        // O(11+n+n*K^n)
        // O(n+n*K^n)
        // O(n*K^n)
        // O(K^n)
    }
}

