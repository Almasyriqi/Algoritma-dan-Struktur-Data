/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpersewaangame;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramPersewaanGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peminjaman pinjam = new Peminjaman();
        Game[] g1 = new Game[4];

        g1[0] = new Game("Monster Hunter");
        g1[1] = new Game("Final Fantasy");
        g1[2] = new Game("Assassin Creed");
        g1[3] = new Game("Dynasty Warrior");

        SewaGame[] sewa1 = new SewaGame[4];

        sewa1[0] = new SewaGame(12000);
        sewa1[1] = new SewaGame(20000);
        sewa1[2] = new SewaGame(15000);
        sewa1[3] = new SewaGame(10000);

        System.out.println("--------------------------------------");
        System.out.println("\tPersewaan Video Game");
        System.out.println("--------------------------------------");
        System.out.println("List Game dan Harga Sewa Perhari: ");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + ". " + g1[i].namaGame + "\t(Rp " + sewa1[i].hargaSewa + ")");
        }
        System.out.println("Note: Jumlah sewa maksimal 4 game");
        System.out.println("--------------------------------------");

        System.out.println("Peminjaman: ");
        System.out.print("Masukkan ID member: ");
        pinjam.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan nama: ");
        pinjam.namaMember = sc.nextLine();
        System.out.print("Masukkan lama pinjam: ");
        pinjam.lamaPinjam = sc.nextInt();
        System.out.print("Jumlah game yang dipinjam: ");
        pinjam.jumlahGame = sc.nextInt();
        System.out.println("--------------------------------------");

        sc.nextLine();
        for (int i = 0; i < pinjam.jumlahGame; i++) {
            System.out.print("Masukkan nama game ke-" + (i + 1) + ": ");
            pinjam.namaGame2 = sc.nextLine();
            for (int j = 0; j < 4; j++) {
                if (pinjam.namaGame2.equalsIgnoreCase(g1[j].namaGame)) {
                    sewa1[i].x = j;
                }
            }
        }

        System.out.println("--------------------------------------");

        System.out.println("============= NOTA =============");
        System.out.println("ID Member \t: " + pinjam.id);
        System.out.println("Nama Member \t: " + pinjam.namaMember);
        System.out.println("Jumlah game \t: " + pinjam.jumlahGame + " Game");
        for (int i = 0; i < pinjam.jumlahGame; i++) {
            System.out.println("Nama Game ke-" + (i + 1) + " \t: " + g1[sewa1[i].x].namaGame);
            System.out.println("Harga Sewa \t: Rp " + sewa1[sewa1[i].x].hargaSewa);
            pinjam.jumlah += sewa1[sewa1[i].x].hargaSewa;
        }
        System.out.println("Lama Pinjam \t: " + pinjam.lamaPinjam + " Hari");
        pinjam.total = pinjam.jumlah * pinjam.lamaPinjam;
        System.out.println("Total Bayar \t: Rp " + pinjam.total);
        System.out.println("--------------------------------------");
    }

}
