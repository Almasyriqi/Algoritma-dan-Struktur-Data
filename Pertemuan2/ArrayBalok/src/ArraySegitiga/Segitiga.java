/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySegitiga;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Segitiga {

    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling() {
        double hasil = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + hasil;
    }
}
