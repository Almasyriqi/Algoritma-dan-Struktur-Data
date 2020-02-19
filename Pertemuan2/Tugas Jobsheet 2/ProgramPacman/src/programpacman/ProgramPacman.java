/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpacman;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ProgramPacman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan pm = new PacMan();

        pm.x = 0;
        pm.y = 0;

        System.out.println("\t\tProgram PacMan");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Note: ");
        System.out.println("1. Arah gerak Pacman adalah kiri, kanan, atas, dan bawah");
        System.out.println("2. Permainan berakhir jika PacMan keluar area permainan");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Permainan dimulai");
        System.out.print("Masukkan Lebar area Permainan: ");
        pm.width = sc.nextInt();
        System.out.print("Masukkan Tinggi area Permainan: ");
        pm.height = sc.nextInt();
        pm.printPosition();
        System.out.println("Koordinat Awal PacMan: " + pm.x + "," + pm.y);
        sc.nextLine();
        for (int i = 0; i < 10;) {
            System.out.print("Gerakan PacMan: ");
            pm.arah = sc.nextLine();
            if (pm.arah.equalsIgnoreCase("kiri")) {
                pm.moveLeft();
            } else if (pm.arah.equalsIgnoreCase("kanan")) {
                pm.moveRight();
            } else if (pm.arah.equalsIgnoreCase("atas")) {
                pm.moveUp();
            } else if (pm.arah.equalsIgnoreCase("bawah")) {
                pm.moveDown();
            } else {
                System.out.println("Gerakan Pacman Salah");
            }
        }
    }

}
