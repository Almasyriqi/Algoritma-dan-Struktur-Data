/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Tiket {
    String namaMaskapai;
    float harga;
    int transitCount;
    int flightTime;
    
    Tiket (String nama, float h, int transit, int time) {
        namaMaskapai = nama;
        harga = h;
        transitCount = transit;
        flightTime = time;
    }
    
    void tampil() {
        System.out.println("============================================");
        System.out.println("Nama Maskapai : "+namaMaskapai);
        System.out.println("Harga Tiket : Rp "+harga);
        System.out.println("Jumlah Transit : "+transitCount);
        System.out.println("Waktu Keberangkatan : pukul "+flightTime);
        
    }
}
