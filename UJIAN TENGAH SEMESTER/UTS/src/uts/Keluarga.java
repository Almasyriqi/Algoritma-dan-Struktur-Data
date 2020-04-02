/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Keluarga {
    public String nama, posisi;
    public int umur;
    
    public Keluarga(String nm, String ps, int u) {
        this.nama = nm;
        this.posisi = ps;
        this.umur = u;
    }
    
    void tampil() {
        System.out.println("Nama \t: "+nama);
        System.out.println("Posisi \t: "+ posisi);
        System.out.println("Umur \t: " + umur);
        System.out.println("===========================================================");
    }
}
