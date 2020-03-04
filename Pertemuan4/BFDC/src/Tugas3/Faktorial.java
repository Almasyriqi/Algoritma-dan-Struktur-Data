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
public class Faktorial {
    public int nilai;
    
    //Source Code asli
    public int faktorialBF(int n) {
        int fakto = 1; // O(1)
        for (int i = 1; i <= n; i++) { // O(n!)
            fakto = fakto * i; // O(1)
        }
        return fakto; // O(1)
    }
    // Notasi Big O Algoritma Brute Force
    // O(1+n!*1+1)
    // O(1+n!+1)
    // O(2+n!)
    // O(n!)
    
    public int faktorialDC(int n) {
        if (n==1) { // O(1)
            return 1; // O(1)
        }
        else 
        {
            int fakto = n * faktorialDC(n-1); // O(K^n)
            return fakto; // O(1)
        }
    }
    // Notasi Big O Algoritma Divide Conquer
    // O(1+1+K^n+1)
    // O(2+K^n+1)
    // O(3+K^n)
    // O(K^n)
    
    
    //Modifikasi kode dari Pertanyaan 2.3.3 nomor 3
//    public int faktorialBF(int n) {
//        int fakto = 1;
//        int i = 1;
//        while (i<=n) {
//            fakto = fakto * i;
//            i++;
//        }
//        return fakto;
//    }
}
