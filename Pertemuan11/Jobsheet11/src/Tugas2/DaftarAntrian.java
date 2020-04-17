/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class DaftarAntrian {

    Antrian head;
    int size;

    public DaftarAntrian() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String nama, String keperluan) {
        head = new Antrian(id, nama, keperluan, head);
        size++;
    }

    public void enqueue(int id, String nama, String keperluan) {
        if (isEmpty()) {
            addFirst(id, nama, keperluan);
        } else {
            Antrian tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Antrian(id, nama, keperluan, null);
        }
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.id;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Antrian tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.id;
    }

    public void Dequeue() throws Exception {
        System.out.println("Nasabah dengan id : " + head.id + " telah selesai antri");
        head = head.next;
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Antrian tmp = head;
            while (tmp != null) {
                System.out.println("===========================================================");
                System.out.println("Id Nasabah\t: " + tmp.id);
                System.out.println("Nama Nasabah\t: " + tmp.nama);
                System.out.println("Keperluan\t: " + tmp.keperluan);
                tmp = tmp.next;
            }
            System.out.println("===========================================================");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            Antrian tmp = head;
            System.out.println("Data Nasabah pada antrian paling depan");
            System.out.println("===========================================================");
            System.out.println("Id Nasabah\t: " + tmp.id);
            System.out.println("Nama Nasabah\t: " + tmp.nama);
            System.out.println("Keperluan\t: " + tmp.keperluan);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            Antrian tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            System.out.println("Data Nasabah pada antrian paling belakang");
            System.out.println("===========================================================");
            System.out.println("Id Nasabah\t: " + tmp.id);
            System.out.println("Nama Nasabah\t: " + tmp.nama);
            System.out.println("Keperluan\t: " + tmp.keperluan);
        }
    }

    public void peekPosition(int id) {
        Antrian tmp = head;
        int index = 0;
        while (tmp.next != null && !tmp.id.equals(id)) {
            tmp = tmp.next;
            index++;
        }
        index += 1;
        if (tmp.id.equals(id)) {
            System.out.println("Nasabah dengan Id : " + id + " berada pada antrian ke-" + index);

        } else {
            System.out.println("Nasabah dengan Id : " + id + " tidak ada dalam antrian");
        }
    }

    public void printNasabah(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Antrian tmp = head;
            for (int i = 1; i <= index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Pada antrian ke-" + (index + 1) + " terdapat data : ");
            System.out.println("========================================");
            System.out.println("Id Nasabah\t: " + tmp.id);
            System.out.println("Nama Nasabah\t: " + tmp.nama);
            System.out.println("Keperluan\t: " + tmp.keperluan);
            System.out.println("========================================");
        }
    }
}
