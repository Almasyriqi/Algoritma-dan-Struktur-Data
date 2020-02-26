/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1_2_3;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    
    public double hitungTotalNilai(int tugas, int kuis, int uts, int uas) {
        return (tugas * 0.3) + (kuis * 0.2) + (uts * 0.2) + (uas * 0.3);
    }
}
