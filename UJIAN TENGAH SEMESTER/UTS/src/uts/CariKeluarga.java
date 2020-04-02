/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class CariKeluarga {
    public int jmlData;
    public Keluarga listKeluarga[];
    public int indeks;
    
    public CariKeluarga(int jumlah) {
        this.jmlData = jumlah;
        listKeluarga = new Keluarga[jumlah];
    }
    
    public void tambah(Keluarga K) {
        if (indeks<listKeluarga.length) {
            listKeluarga[indeks] = K;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil() {
        for (Keluarga K : listKeluarga) {
            K.tampil();
        }
    }
    
    void selectionSort() {
        for (int i = 0; i < listKeluarga.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listKeluarga.length; j++) {
                if (listKeluarga[j].umur < listKeluarga[idxMin].umur) {
                    idxMin = j;
                }
            }
            //swap
            Keluarga tmp = listKeluarga[idxMin];
            listKeluarga[idxMin] = listKeluarga[i];
            listKeluarga[i] = tmp;
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listKeluarga[mid].umur) {
                return (mid);
            } else if (listKeluarga[mid].umur > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("Ada anggota keluarga yang berumur " + x + " tahun");
            System.out.println("Nama\t: " + listKeluarga[pos].nama);
            System.out.println("Posisi\t: " + listKeluarga[pos].posisi);
            System.out.println("Umur\t: " + listKeluarga[pos].umur);
            System.out.println("===========================================================");
        }
        else {
            System.out.println("Tidak Ada anggota keluarga yang berumur " + x + " tahun");
        }
    }
}
