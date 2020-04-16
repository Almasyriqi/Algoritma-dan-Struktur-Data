/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ModifMainLinkedList {

    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void tambah() {
        System.out.println("------------------------------------");
        System.out.println("Submenu Tambah:");
        System.out.println("1. Tambah (First)");
        System.out.println("2. Tambah(Index)");
        System.out.println("3. Tambah(Last)");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void hapus() {
        System.out.println("------------------------------------");
        System.out.println("Submenu Hapus:");
        System.out.println("1. Hapus (Index)");
        System.out.println("2. Hapus (Key)");
        System.out.println("3. Clear");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void cari() {
        System.out.println("------------------------------------");
        System.out.println("Submenu Cari:");
        System.out.println("1. Cari (Index)");
        System.out.println("2. Cari (Key)");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ModifLinkedList data = new ModifLinkedList();

        int pilih, pilih1, pilih2, pilih3;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    tambah();
                    pilih1 = sc.nextInt();
                    switch (pilih1) {
                        case 1:
                            Object a;
                            System.out.print("Masukkan data : ");
                            a = sc2.nextLine();
                            try {
                                data.addFirst(a);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            Object b;
                            System.out.print("Masukkan data : ");
                            b = sc2.nextLine();
                            System.out.print("Masukkan index : ");
                            int indeks = sc.nextInt();
                            try {
                                data.add(b, indeks);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            Object c;
                            System.out.print("Masukkan data : ");
                            c = sc2.nextLine();
                            try {
                                data.addLast(c);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 2:
                    hapus();
                    pilih2 = sc.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Masukkan index : ");
                            int indeks = sc.nextInt();
                            try {
                                data.remove(indeks);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            Object b;
                            System.out.print("Masukkan data : ");
                            b = sc2.nextLine();
                            try {
                                data.removeByValue(b);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            try {
                                data.clear();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 3:
                    cari();
                    pilih3 = sc.nextInt();
                    switch (pilih3) {
                        case 1:
                            System.out.print("Masukkan index : ");
                            int indeks = sc.nextInt();
                            try {
                                data.cariIndex(indeks);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            Object c;
                            System.out.print("Masukkan data : ");
                            c = sc2.nextLine();
                            try {
                                data.cariKey(c);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 4:
                    try {
                        data.print();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Terimakasih telah menggunakan program ini");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih > 0 && pilih <= 5);
    }

}
