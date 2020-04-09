/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Nasabah {
    public String noRekening;
    public String nama;
    
    public Nasabah(String noRek, String nm) {
        this.noRekening = noRek;
        this.nama = nm;
    }
    
    public Nasabah() {
        
    }
    
    void print() {
        System.out.println("Nama Nasabah \t: "+ nama);
        System.out.println("Nomor Rekening \t: " + noRekening);
        System.out.println("===========================================================");
    }
}
