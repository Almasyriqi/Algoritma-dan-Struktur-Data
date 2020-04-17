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
public class DaftarAntrianMain {

    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("Menu Antrian Nasabah Bank:");
        System.out.println("1. Tambah Antrian (Enqueue)");
        System.out.println("2. Hapus Antrian (Dequeue)");
        System.out.println("3. Print Antrian");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Lihat data berdasarkan Id Nasabah");
        System.out.println("7. Lihat data berdasarkan posisi antrian");
        System.out.println("8. Keluar Program");
        System.out.println("-----------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DaftarAntrian antri = new DaftarAntrian();

        int pilih, id, posisi;
        String nama, keperluan;

        System.out.println("Studi kasus yang memanfaatkan Queue, dibuat dengan konsep Linked Lists");
        System.out.println("Studi Kasus : Antrian Nasabah Bank");

        do {
            menu();
            pilih = sc.nextInt();
            try {
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Id : ");
                        id = sc.nextInt();
                        System.out.print("Masukkan Nama : ");
                        nama = sc2.nextLine();
                        System.out.print("Masukkan Keperluan : ");
                        keperluan = sc2.nextLine();
                        antri.enqueue(id, nama, keperluan);
                        break;
                    case 2:
                        antri.Dequeue();
                        break;
                    case 3:
                        antri.print();
                        break;
                    case 4:
                        antri.peekFront();
                        break;
                    case 5:
                        antri.peekRear();
                        break;
                    case 6:
                        System.out.print("Masukkan Id : ");
                        id = sc.nextInt();
                        antri.peekPosition(id);
                        break;
                    case 7:
                        System.out.print("Masukkan posisi antrian : ");
                        posisi = sc.nextInt();
                        posisi -= 1;
                        antri.printNasabah(posisi);
                        break;
                    case 8:
                        System.out.println("Terimakasih telah menggunakan program ini");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih > 0 || pilih <= 8);
    }
}
