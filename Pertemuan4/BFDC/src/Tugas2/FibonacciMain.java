/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class FibonacciMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // O(1)
        
        Fibonacci fb = new Fibonacci(); // O(1)
        System.out.println("Program Deret Fibonacci Brute Force dan Divide Conquer"); // O(1)
        System.out.println("========================================================"); // O(1)
        System.out.print("Masukkan jumlah deret fibonacci : "); // O(1)
        fb.nilai = sc.nextInt(); // O(1)
        
        int fib[] = new int[fb.nilai]; // O(1)
        fib[0] = 0; // O(1)
        fib[1] = 1; // O(1)
        
        for (int i=2; i<fb.nilai; i++) { // O(n)
            fib[i] = fib[i-1] + fib[i-2]; // O(1)
        }
        
        System.out.println("Hasil Fibonacci dengan Brute Force"); // O(1)
        for (int i=0; i<fb.nilai; i++) { // O(n)
            System.out.print(fib[i] + " "); // O(1)
        }
        System.out.println(); // O(1)
        // Notasi Big O Algoritma Brute Force
        // O(1+1+1+1+1+1+1+1+1+n*1+1+n*1+1)
        // O(9+n+1+n+1)
        // O(11+2n)
        // O(2n)
        // O(n)
        
        System.out.println("====================================================="); // O(1)
        System.out.println("Hasil Fibonacci dengan Divide and Conquer"); // O(1)
        for (int i = 0; i < fb.nilai; i++) { // O(n)
            System.out.print(fb.fibonacciDC(i) + " "); // O(K^n)
        }
        System.out.println(); // O(1)
        // Notasi Big O Algoritma Divide Conquer
        // O(1+1+1+1+1+1+1+1+n*K^n+1)
        // O(8+n*K^n+1)
        // O(9+n*K^n)
        // O(n*K^n)
        // O(K^n)
    }
    
}
