/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpacman;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class PacMan {

    public int x;
    public int y;
    public int width;
    public int height;
    public String arah;

    void moveLeft() {
        if (x > 0) {
            x -= 1;
            printPosition();
            System.out.println("Posisi PacMan: " + x + "," + y);
        } else {
            System.out.println("PacMan Keluar Area Permainan");
            System.out.println("Game Over");
            System.out.println("-----------------------------------------------------------");
            System.exit(0);
        }
    }

    void moveRight() {
        if (x >= width) {
            System.out.println("PacMan Keluar Area Permainan");
            System.out.println("Game Over");
            System.out.println("-----------------------------------------------------------");
            System.exit(0);
        } else {
            x += 1;
            printPosition();
            System.out.println("Posisi PacMan: " + x + "," + y);
        }
    }

    void moveDown() {
        if (y >= height) {
            System.out.println("PacMan Keluar Area Permainan");
            System.out.println("Game Over");
            System.out.println("-----------------------------------------------------------");
            System.exit(0);
        } else {
            y += 1;
            printPosition();
            System.out.println("Posisi PacMan: " + x + "," + y);
        }
    }

    void moveUp() {
        if (y > 0) {
            y -= 1;
            printPosition();
            System.out.println("Posisi PacMan: " + x + "," + y);
        } else {
            System.out.println("PacMan Keluar Area Permainan");
            System.out.println("Game Over");
            System.out.println("-----------------------------------------------------------");
            System.exit(0);
        }
    }

    void printPosition() {
        System.out.println("-------------------------------");
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {

                if (i == y && j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------------------------");
    }
}
