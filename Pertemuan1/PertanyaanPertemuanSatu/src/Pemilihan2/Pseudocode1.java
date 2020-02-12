/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemilihan2;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Pseudocode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        
        System.out.println("ALGORITMA");
        System.out.print("Masukkan nilai y: ");
        y=sc.nextInt();
        if (y%2==0 && 7%6!=0 && y%15!=0){
            System.out.println("Bilangan kelipatan 2");
        }
        else if (y%6==0 && y%15!=0) {
            System.out.println("Bilangan kelipatan 6");
        }
        else if (y%15==0) {
            System.out.println("Bilangan kelipatan 15");
        }
        else {
            System.out.println("Bilangan bukan kelipatan 2,6,ataupun 15");
        }
    }
}
