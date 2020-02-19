/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkampus;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class NilaiKampus {
    public int nilai1;
    public int nilai2;
    public int terbaik;
    
    public int nilaiTerbaik() {
        if (nilai1 > nilai2) {
            return terbaik = nilai1;
        }
        else {
            return terbaik = nilai2;
        }
    }
}
