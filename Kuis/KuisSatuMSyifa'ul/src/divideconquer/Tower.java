/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideconquer;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Tower {
    
    public static void towerOfHanoi(int numDisk, char source, char destination, char spare) {
        if (numDisk>1) {
            towerOfHanoi(numDisk-1, source, spare, destination);
            System.out.println("Pindah gelang " + numDisk + " dari tower " + source + " ke tower " + destination);
            towerOfHanoi(numDisk-1, spare, destination, source);
        }
        else {
            System.out.println("Pindah 1 gelang dari tower " + source + " ke tower " + destination);
        }
    }
    
    public static void main(String[] args) {
        int n=4; // jumlah gelang
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B, C adalah nama tower
        
    }
}
