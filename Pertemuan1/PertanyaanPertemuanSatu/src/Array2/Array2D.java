/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array1[][] = new int[4][5];
        int jumlah=0;
        
        System.out.println("Input elemen Array1");
        System.out.println("--------------------------------------");
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[0].length; j++) {
                System.out.print("Masukkan elemen ke-[" + i + "][" + j + "]: ");
                Array1[i][j] = sc.nextInt();
                jumlah += Array1[i][j];
            }
            System.out.println("--------------------------------------");
        }
        System.out.println("Total jumlah Array1 = " + jumlah);
    }
}
