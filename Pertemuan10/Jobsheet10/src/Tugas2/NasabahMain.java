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
public class NasabahMain {

    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Nasabah");
        System.out.println("8. Keluar");
        System.out.println("------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    System.out.print("Nama : ");
                    String nama = sc2.nextLine();
                    System.out.print("Nomor rekening : ");
                    String noRek = sc2.nextLine();
                    Nasabah N = new Nasabah(nama, noRek);
                    Q.tambah(N);
                    Q.Enqueue(nama, noRek);
                    break;
                case 2:
                    String dataKeluar = Q.Dequeue();
                    System.out.println("Nama nasabah yang selesai antri: " + dataKeluar);
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama nasabah : ");
                    String data = sc2.nextLine();
                    Q.peekPosition(data);
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian : ");
                    int posisi = sc.nextInt();
                    Q.printNasabah(posisi);
                    break;
                case 8:
                    System.out.println("Terimakasih telah menggunakan program ini");
                    System.exit(0);
            }
        } while (pilih == 1 | pilih == 2 | pilih == 3 | pilih == 4 | pilih == 5 | pilih == 6 | pilih == 7);
    }
}
