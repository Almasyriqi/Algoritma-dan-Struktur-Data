/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Fibonacci {
    public int nilai;
    
    int fibonacciDC(int n) {
        if (n==0 || n==1) { // O(1)
            return (n); // O(1)
        }
        else {
            return (fibonacciDC(n-1) + fibonacciDC(n-2)); // O(K^n)
        }
    }
    // Notasi Big O
    // O(1+1+K^n)
    // O(2+K^n)
    // O(K^n)
}
