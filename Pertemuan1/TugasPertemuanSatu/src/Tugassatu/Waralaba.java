/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugassatu;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Waralaba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paket, menu1, menu2, CA = 12000, CB = 15000, CC = 20000, x = 0, totalp = 0;
        int OA = 10000, OB = 12000, OC = 15000, jumlah, total = 0;
        String ulang;

        for (ulang = "ya"; ulang.equalsIgnoreCase("ya");) {
            System.out.println("===========================");
            System.out.println("\tRestoran OK");
            System.out.println("===========================");
            System.out.println("Paket menu :");
            System.out.println("1. Paket Chikcen");
            System.out.println("2. Paket Oke");
            System.out.println("===========================");
            System.out.print("Pilih paket : ");
            paket = sc.nextInt();

            switch (paket) {
                case 1:
                    x++;
                    System.out.println("Menu Paket Chicken");
                    System.out.println("1. Chicken A (Rp. 12.000)");
                    System.out.println("2. Chicken B (Rp. 15.000)");
                    System.out.println("3. Chicken C (Rp. 20.000)");
                    System.out.print("Pilih menu : ");
                    menu1 = sc.nextInt();
                    switch (menu1) {
                        case 1:
                            System.out.println("Pembelian Chicken A");
                            System.out.print("Jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = CA * jumlah;
                            break;
                        case 2:
                            System.out.println("Pembelian Chicken B");
                            System.out.print("Jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = CB * jumlah;
                            break;
                        case 3:
                            System.out.println("Pembelian Chicken C");
                            System.out.print("Jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = CB * jumlah;
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    x++;
                    System.out.println("Menu Paket Oke");
                    System.out.println("1. Oke A (Rp. 10.000)");
                    System.out.println("2. Oke B (Rp. 12.000");
                    System.out.println("3. Oke C (Rp. 15.000)");
                    System.out.print("Pilih menu : ");
                    menu2 = sc.nextInt();
                    switch (menu2) {
                        case 1:
                            System.out.println("Pembelian Oke A");
                            System.out.print("Jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = OA * jumlah;
                            break;
                        case 2:
                            System.out.println("Pembelian Oke B");
                            System.out.print("Jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = OB * jumlah;
                            break;
                        case 3:
                            System.out.println("Pembelian Oke C");
                            System.out.print("Jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = OC * jumlah;
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                            break;
                    }
                    break;

                default:
                    System.out.println("Paket tidak tersedia");

            }
            totalp += total;
            sc.nextLine();
            System.out.print("Pilih menu lain? ");
            ulang = sc.nextLine();
        }

        System.out.println("Total pembayaran : " + totalp);
    }
}
