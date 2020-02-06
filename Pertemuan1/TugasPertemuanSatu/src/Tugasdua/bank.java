/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugasdua;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class bank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0, saldoAwal, saldoAkhir;
        double bunga;
        
        System.out.println("Menghitung lama menabung dengan bunga 2% per bulan");
        System.out.print("Saldo Awal = Rp ");
        saldoAwal = sc.nextInt();
        System.out.print("Saldo Akhir = Rp ");
        saldoAkhir = sc.nextInt();
        for (int saldo = saldoAwal; saldo <= saldoAkhir; saldo += bunga ) {
            bunga = saldo * 0.02;
            x++;
        }
        System.out.println("Lama menabung = " + x + " bulan");
    }
}
