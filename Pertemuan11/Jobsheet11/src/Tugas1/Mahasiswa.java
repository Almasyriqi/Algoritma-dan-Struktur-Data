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
public class Mahasiswa<M> {
    M nim;
    M nama;
    M alamat;
    Mahasiswa<M> next;
    
    public Mahasiswa(M nim, M nm, M al, Mahasiswa<M> next) {
        this.nim = nim;
        this.nama = nm;
        this.alamat = al;
        this.next = next;
    }
}
