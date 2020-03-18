/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;


/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class NilaiAlgoritmaDC {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    
    public double hitungTotalNilai(int tugas, int kuis, int uts, int uas) {
        return (tugas * 0.3) + (kuis * 0.2) + (uts * 0.2) + (uas * 0.3);
    }
    
    double rataDC(double arr[], int a, int b){
        if(a==b){
            return arr[a];
        }
        else if(a<b){
            int tengah= (a+b)/2;
            double anilai=rataDC(arr, a, tengah-1);
            double bnilai = rataDC(arr, tengah+1, b);
            return bnilai+anilai + arr[tengah];
        }
        return 0;
    }
}
