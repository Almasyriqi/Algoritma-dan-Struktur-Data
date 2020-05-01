package Tugas3;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Mahasiswa {
    String nama;
    int nilai;
    Mahasiswa next, prev;
    
    public Mahasiswa(Mahasiswa prev, String nama, int nilai, Mahasiswa next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}
