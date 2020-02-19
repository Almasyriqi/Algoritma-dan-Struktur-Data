/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtanah;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramTanah {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JumlahTanah jml = new JumlahTanah();
        
        System.out.println("Program Menghitung Luas Tanah");
        System.out.println("-------------------------------------------");
        System.out.print("Jumlah Tanah: ");
        jml.jumlah = sc.nextInt();
        
        Tanah[] tn = new Tanah[jml.jumlah];
        for (int i = 0; i < jml.jumlah; i++) {
            tn[i] = new Tanah();
            System.out.println("Tanah ke-" + (i+1));
            System.out.print("Panjang: ");
            tn[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            tn[i].lebar = sc.nextInt();
            System.out.println("-------------------------------------------");
        }
        
        for (int i = 0; i < jml.jumlah; i++) {
            System.out.println("Luas Tanah ke-" + (i+1) + ": " + tn[i].luasTanah());
        }
        jml.luas = tn[0].luasTanah();
        jml.terluas = 1;
        for (int i = 0; i < jml.jumlah; i++) {
            if (tn[i].luasTanah() > jml.luas) {
                jml.luas = tn[i].luasTanah();
                jml.terluas = (i+1);
            }
        }
        
        System.out.println("Tanah Terluas: Tanah ke-" + jml.terluas);
        System.out.println("-------------------------------------------");
        
    }
    
}
