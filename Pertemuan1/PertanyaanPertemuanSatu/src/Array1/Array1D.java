/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        int arr[] = new int[15];
        int genap[] = new int[15];
        int ganjil[] = new int[15];
        
        System.out.println("--------------------------------------");
        System.out.println("Input nilai array");
        for (int i = 0; i < 15; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i]%2 == 0){
                genap[a] = arr[i];
                a++;
            }
            else {
                ganjil[b] = arr[i];
                b++;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Array Genap");
        for (int i = 0; i < a; i++) {
            System.out.println("Nilai genap ke-" + (i+1) + ": " + genap[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Array Ganjil");
        for (int i = 0; i < b; i++) {
            System.out.println("Nilai ganjil ke-" + (i+1) + ": " + ganjil[i]);
        }
        System.out.println("--------------------------------------");
    }
}
