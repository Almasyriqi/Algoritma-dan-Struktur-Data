/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaslima;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class fungsi {

    static Scanner sc = new Scanner(System.in);
    static int pilih;

    public static void main(String[] args) {
        menu();
        pilihmenu();
    }

    static void persegi(int sisi) {
        System.out.print("Masukkan nilai sisi : ");
        sisi = sc.nextInt();
        int luas = sisi * sisi;
        System.out.println("Nilai luas = " + luas);
        menu();
        pilihmenu();
    }

    static void menu() {
        System.out.println("--------------------------------------");
        System.out.println("\t\tDaftar menu");
        System.out.println("--------------------------------------");
        System.out.println("1. Hitung luas segitiga");
        System.out.println("2. Hitung luas persegi");
        System.out.println("3. Hitung luas lingkaran");
        System.out.println("4. Keluar");
        System.out.println("--------------------------------------");
        System.out.print("Pilih menu : ");
        pilih = sc.nextInt();
    }

    static void segitiga(int alas, int tinggi) {
        System.out.print("Masukkan nilai alas : ");
        alas = sc.nextInt();
        System.out.print("Masukkan nilai tinggi : ");
        tinggi = sc.nextInt();
        double luas = alas * tinggi / 2;
        System.out.println("Nilai luas = " + luas);
        menu();
        pilihmenu();
    }

    static void lingkaran(int jari, double phi) {
        phi = 3.14;
        System.out.print("Masukkan nilai jari-jari : ");
        jari = sc.nextInt();
        double luas = phi * jari * jari;
        System.out.println("Nilai luas = " + luas);
        menu();
        pilihmenu();
    }

    static void pilihmenu() {
        int alas = 0, tinggi = 0, sisi = 0, jari = 0;
        double phi = 0;
        switch (pilih) {
            case 1:
                segitiga(alas, tinggi);
                break;
            case 2:
                persegi(sisi);
                break;
            case 3:
                lingkaran(jari, phi);
                break;
            case 4:
                System.out.println("Terimakasih telah menggunakan program ini");
                System.exit(0);
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
