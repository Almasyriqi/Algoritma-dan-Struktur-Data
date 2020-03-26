/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ModifStackMain {
    public static void main(String[] args) {
        ModifStack tumpukan = new ModifStack(4);
        
        System.out.println("Modifikasi Praktikum Stack");
        System.out.println("==============================================");
        
        String ulang = "ya";
        while (ulang.equalsIgnoreCase(ulang)) {
            tumpukan.menu();
            tumpukan.pilihmenu();
        }
    }
}
