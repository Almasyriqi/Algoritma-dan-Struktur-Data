/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramJajarGenjang {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JajarGenjang[] jg = new JajarGenjang[5];
        
        System.out.println("Menghitung Luas dan keliling Jajar Genjang");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 5; i++) {
            jg[i] = new JajarGenjang();
            System.out.println("Jajar genjang ke-" + (i+1));
            System.out.print("Masukkan Alas: ");
            jg[i].alas = sc.nextInt();
            System.out.print("Masukkan Tinggi: ");
            jg[i].tinggi = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            jg[i].miring = sc.nextInt();
        }
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Jajar genjang ke-" + (i+1));
            System.out.println("Luas = " + jg[i].hitungLuas());
            System.out.println("Keliling = " + jg[i].hitungKeliling());
        }
        System.out.println("-------------------------------------------");
    } 
}
