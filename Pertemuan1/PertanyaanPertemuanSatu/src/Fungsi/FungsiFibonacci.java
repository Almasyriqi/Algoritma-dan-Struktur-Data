/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class FungsiFibonacci {

    static Scanner sc = new Scanner(System.in);
    static int pilih, fib[];

    public static void main(String[] args) {
        menu();
        pilihmenu();
    }

    static void menu() {
        System.out.println("--------------------------------------");
        System.out.println("\tDeret Fibonacci");
        System.out.println("--------------------------------------");
        System.out.println("1. Menampilkan dengan perulangan");
        System.out.println("2. Menampilkan dengan fungsi rekursif");
        System.out.println("3. Keluar");
        System.out.println("--------------------------------------");
        System.out.print("Pilih menu : ");
        pilih = sc.nextInt();
    }

    static void pilihmenu() {
        int n, x = 0;
        switch (pilih) {
            case 1:
                perulangan(x);
                break;
            case 2:
                System.out.print("Masukkan jumlah deret fibonacci : ");
                n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print(fibo(i) + " ");
                }
                System.out.println();
                menu();
                pilihmenu();
                break;
            case 3:
                System.out.println("Terimakasih telah menggunakan program ini");
                System.exit(0);
            default:
                System.out.println("Menu tidak tersedia");
        }
    }

    static void perulangan(int x) {
        System.out.print("Masukkan jumlah deret fibonacci : ");
        x = sc.nextInt();

        fib = new int[x];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < x; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
        menu();
        pilihmenu();
    }

    static int fibo(int n) {
        if (n == 0 || n == 1) {
            return (n);
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }
    }
}
