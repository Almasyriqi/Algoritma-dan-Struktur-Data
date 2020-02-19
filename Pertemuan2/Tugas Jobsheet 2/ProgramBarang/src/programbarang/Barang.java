/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbarang;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Barang {
    public String nama;
    public int hargaSatuan;
    public int jumlah;
    
    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }
    
    int hitungDiskon() {
        if (hitungHargaTotal() > 100000) {
            return hitungHargaTotal() * 10 / 100;
        }
        else if (hitungHargaTotal() >= 50000) {
            return hitungHargaTotal() * 5 / 100;
        }
        else {
            return 0;
        }
    }
    
    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
