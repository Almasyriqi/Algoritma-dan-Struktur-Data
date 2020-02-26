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
    
    public double hitungTotalNilai(int n, int tugas, int kuis, int uts, int uas) {
        double total = 0;
        if (n == 0){
            return 1;
        }
        else {
             return hitungTotalNilai( n-1, tugas, kuis, uts, uas) + hitungTotalNilai( n-1, tugas, kuis, uts, uas);
           
        }
    }
    
    double rataDC(double arr[], int a, int b){
        if(a==b){
            return arr[1];
        }
        else if(a<b){
            int nilai= (a+b)/2;
            double anilai=rataDC(arr, a, nilai-1);
            double bnilai = rataDC(arr, nilai+1, b);
            return bnilai+anilai + arr[nilai];
        }
        return 0;
    }
}
