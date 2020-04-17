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
public class DaftarMahasiswa {

    Mahasiswa head;
    int size;

    public DaftarMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nim, String nama, String alamat) {
        head = new Mahasiswa(nim, nama, alamat, head);
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public void add(int nim, String nama, String alamat, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(nim, nama, alamat);
        } else {
            Mahasiswa tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Mahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new Mahasiswa(nim, nama, alamat, next);
        }
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public void addLast(int nim, String nama, String alamat) {
        if (isEmpty()) {
            addFirst(nim, nama, alamat);
        } else {
            Mahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Mahasiswa(nim, nama, alamat, null);
        }
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.nim;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Mahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Mahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.nim;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            removeFirst();
            System.out.println("Data berhasil dihapus");
        } else {
            Mahasiswa prev = head;
            Mahasiswa cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
            System.out.println("Data berhasil dihapus");
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void removeByValue(Object cari) throws Exception {
        Mahasiswa prev = null;
        Mahasiswa cur = head;
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        while (cur.next != null && !cur.nim.equals(cari)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == head) {
            removeFirst();
        } else {
            if (cur.nim.equals(cari)) {
                prev.next = cur.next;
                size--;
                System.out.println("Data berhasil dihapus");
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    public void clear() {
        head = null;
        size = 0;
        System.out.println("Semua data berhasil dihapus");
    }

    public void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = head;
            while (tmp != null) {
                System.out.println("========================================");
                System.out.println("NIM \t: " + tmp.nim);
                System.out.println("Nama \t: " + tmp.nama);
                System.out.println("Alamat \t: " + tmp.alamat);
                tmp = tmp.next;
            }
            System.out.println("========================================");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void cariIndex(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Mahasiswa tmp = head;
            for (int i = 1; i <= index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Indeks ke-" + index + " terdapat data : ");
            System.out.println("========================================");
            System.out.println("NIM \t: " + tmp.nim);
            System.out.println("Nama \t: " + tmp.nama);
            System.out.println("Alamat \t: " + tmp.alamat);
            System.out.println("========================================");
        }
    }

    public void cariKey(Object key) {
        Mahasiswa tmp = head;
        while (tmp.next != null && !tmp.nim.equals(key)) {
            tmp = tmp.next;
        }
        if (tmp.nim.equals(key)) {
            System.out.println("Data " + key + " ditemukan");
            System.out.println("========================================");
            System.out.println("NIM \t: " + tmp.nim);
            System.out.println("Nama \t: " + tmp.nama);
            System.out.println("Alamat \t: " + tmp.alamat);
            System.out.println("========================================");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
