/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugastiga;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class simpankata {
    public static void main(String[] args) {
       char[] kata = {'M','I','S','S','I','S','S','I','P','I'};
       int a=0,b=0,c=0,d=0;
       
        System.out.println("Menghitung jumlah huruf M,I,S,P pada kata MISSISSIPI");
        for (int i = 0; i < kata.length; i++) {
           switch (kata[i]) {
               case 'M':
                   a++;
                   break;
               case 'I':
                   b++;
                   break;
               case 'S':
                   c++;
                   break;
               default:
                   d++;
                   break;
           }
        }
        System.out.println("Jumlah huruf M = " + a);
        System.out.println("Jumlah huruf I = " + b);
        System.out.println("Jumlah huruf S = " + c);
        System.out.println("Jumlah huruf P = " + d);
    }
}
