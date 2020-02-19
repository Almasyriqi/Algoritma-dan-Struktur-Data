/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class JajarGenjang {
    public int tinggi;
    public int alas;
    public int miring;
    
    
    public int hitungLuas() {
        return alas * tinggi;
    }
    
    public int hitungKeliling() {
        return (2 * alas) + (2 * miring);
    }
}
