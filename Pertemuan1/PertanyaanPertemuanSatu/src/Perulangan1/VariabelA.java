/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan1;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class VariabelA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Masukkan nilai A: ");
        a = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            a -= 3;
            System.out.println("A - 3 = " + a);
        }
        if (a%2 == 0) {
            System.out.println("Nilai A Genap");
        }
        else {
            System.out.println("Nilai A Ganjil");
        }
    }
}
