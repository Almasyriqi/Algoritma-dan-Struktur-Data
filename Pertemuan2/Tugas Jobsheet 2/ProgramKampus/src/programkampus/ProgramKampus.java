/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkampus;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramKampus {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JumlahMhs jmlh = new JumlahMhs();
        
        System.out.println("Program Nilai Terbaik Mahasiswa");
        System.out.println("-------------------------------------------");
        System.out.print("Jumlah Mahasiswa: ");
        jmlh.jumlah = sc.nextInt();
        NilaiKampus[] nilai = new NilaiKampus[jmlh.jumlah];
        
        for (int i = 0; i < jmlh.jumlah; i++) {
            nilai[i] = new NilaiKampus();
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Nilai 1 : ");
            nilai[i].nilai1 = sc.nextInt();
            System.out.print("Nilai 2 : ");
            nilai[i].nilai2 = sc.nextInt();
            System.out.println("-------------------------------------------");
        }
        for (int i = 0; i < jmlh.jumlah; i++) {
            System.out.println("Nilai terbaik Mahasiswa ke-" + (i+1) + ": " + nilai[i].nilaiTerbaik());
        }

    }
    
}
