/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbarang;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramBarang {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang brg = new Barang();
        
        System.out.println("Program Pembelian Barang");
        System.out.println("--------------------------------------");
        System.out.print("Nama Barang \t: ");
        brg.nama = sc.nextLine();
        System.out.print("Harga Satuan \t: ");
        brg.hargaSatuan = sc.nextInt();
        System.out.print("Jumlah Barang \t: ");
        brg.jumlah = sc.nextInt();
        System.out.println("--------------------------------------");
        
        System.out.println("================ NOTA ================");
        System.out.println("Nama Barang \t\t: " + brg.nama);
        System.out.println("Harga Satuan \t\t: Rp "+ brg.hargaSatuan);
        System.out.println("Jumlah Barang \t\t: " + brg.jumlah + " pcs");
        System.out.println("Total Pembelian \t: Rp " + brg.hitungHargaTotal());
        if (brg.hitungHargaTotal() > 100000) {
            System.out.println("Diskon \t\t\t: 10%");
            System.out.println("Jumlah Potongan \t: Rp " + brg.hitungDiskon());
            System.out.println("Total Pembayaran \t: Rp " + brg.hitungHargaBayar());
        }
        else if (brg.hitungHargaTotal() >= 50000 ){
            System.out.println("Diskon \t\t\t: 5% ");
            System.out.println("Jumlah Potongan \t: Rp " + brg.hitungDiskon());
            System.out.println("Total Pembayaran \t: Rp " + brg.hitungHargaBayar());
        }
        else {
            System.out.println("Total Pembayaran \t: Rp " + brg.hitungHargaBayar());
        }
        System.out.println("======================================");
    }
    
}
