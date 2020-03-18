/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;


/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class DaftarTiket {
    Tiket listTiket[] = new Tiket[5];
    int indeks;
    
    void tambah(Tiket T) {
        if (indeks<listTiket.length) {
            listTiket[indeks] = T;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil() {
        for (Tiket T : listTiket) {
            T.tampil();
        }
    }
    
    void bubbleSort() {
        for (int i = 0; i < listTiket.length-1; i++) {
            for (int j = 1; j < listTiket.length-i; j++) {
                if (listTiket[j].harga < listTiket[j-1].harga) {
                    //di bawah ini proses swap atau penukaran
                    Tiket tmp = listTiket[j];
                    listTiket[j] = listTiket[j-1];
                    listTiket[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort() {
        for (int i = 0; i < listTiket.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listTiket.length; j++) {
                if (listTiket[j].harga < listTiket[idxMin].harga) {
                    idxMin = j;
                }
            }
            //swap
            Tiket tmp = listTiket[idxMin];
            listTiket[idxMin] = listTiket[i];
            listTiket[i] = tmp;
        }
    }
}
