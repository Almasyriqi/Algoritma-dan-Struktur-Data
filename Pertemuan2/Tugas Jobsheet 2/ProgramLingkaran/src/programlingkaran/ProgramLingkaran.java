/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlingkaran;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramLingkaran {

    
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukkan nilai jari-jari = ");
        l1.r = sc.nextDouble();
        l1.PHI = 3.14;
        System.out.printf("Luas lingkaran = %.2f", l1.hitungLuas());
        System.out.println();
        System.out.printf("Keliling lingkaran = %.2f", l1.hitungKeliling());
        System.out.println();
    }
    
}
