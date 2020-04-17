/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class DaftarMahasiswaMain {

    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("Menu Daftar Mahasiswa:");
        System.out.println("1. Tambah data mahasiswa");
        System.out.println("2. Hapus data mahasiswa");
        System.out.println("3. Cari data mahasiswa");
        System.out.println("4. Print mahasiswa terdaftar");
        System.out.println("5. Keluar");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void tambah() {
        System.out.println("------------------------------------");
        System.out.println("Submenu Tambah data mahasiswa:");
        System.out.println("1. Tambah (First)");
        System.out.println("2. Tambah(Index)");
        System.out.println("3. Tambah(Last)");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void hapus() {
        System.out.println("------------------------------------");
        System.out.println("Submenu Hapus data mahasiswa:");
        System.out.println("1. Hapus (Index)");
        System.out.println("2. Hapus (NIM)");
        System.out.println("3. Clear");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void cari() {
        System.out.println("------------------------------------");
        System.out.println("Submenu Cari data mahasiswa:");
        System.out.println("1. Cari (Index)");
        System.out.println("2. Cari (NIM)");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DaftarMahasiswa mhs = new DaftarMahasiswa();

        int pilih, pilih1, pilih2, pilih3, nim, index;
        String nama, alamat;

        do {
            menu();
            pilih = sc.nextInt();
            try {
                switch (pilih) {
                    case 1:
                        tambah();
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.print("Masukkan NIM : ");
                                nim = sc.nextInt();
                                System.out.print("Masukkan Nama : ");
                                nama = sc2.nextLine();
                                System.out.print("Masukkan Alamat : ");
                                alamat = sc2.nextLine();
                                mhs.addFirst(nim, nama, alamat);
                                break;
                            case 2:
                                System.out.print("Masukkan NIM : ");
                                nim = sc.nextInt();
                                System.out.print("Masukkan Nama : ");
                                nama = sc2.nextLine();
                                System.out.print("Masukkan Alamat : ");
                                alamat = sc2.nextLine();
                                System.out.print("Masukkan index : ");
                                index = sc.nextInt();
                                mhs.add(nim, nama, alamat, index);
                                break;
                            case 3:
                                System.out.print("Masukkan NIM : ");
                                nim = sc.nextInt();
                                System.out.print("Masukkan Nama : ");
                                nama = sc2.nextLine();
                                System.out.print("Masukkan Alamat : ");
                                alamat = sc2.nextLine();
                                mhs.addLast(nim, nama, alamat);
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
                                index = sc.nextInt();
                                mhs.remove(index);
                                break;
                            case 2:
                                System.out.print("Masukkan NIM : ");
                                nim = sc.nextInt();
                                mhs.removeByValue(nim);
                                break;
                            case 3:
                                mhs.clear();
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
                                index = sc.nextInt();
                                mhs.cariIndex(index);
                                break;
                            case 2:
                                System.out.print("Masukkan NIM : ");
                                nim = sc.nextInt();
                                mhs.cariKey(nim);
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia");
                        }
                        break;
                    case 4:
                        mhs.print();
                        break;
                    case 5:
                        System.out.println("Terimakasih telah menggunakan program ini");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih > 0 || pilih <= 5);
    }
}
