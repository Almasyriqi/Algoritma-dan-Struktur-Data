/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class LinkedListPariwisata {
    Pariwisata head;
    int size;
    
    public LinkedListPariwisata() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int bulan, int dt18, int dt19, int dt20) {
        head = new Pariwisata(bulan, dt18, dt19, dt20, head);
        size++;
    }
    
    public void add(int bulan, int dt18, int dt19, int dt20, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(bulan, dt18, dt19, dt20);
        } else {
            Pariwisata tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Pariwisata next = (tmp == null) ? null : tmp.next;
            tmp.next = new Pariwisata(bulan, dt18, dt19, dt20, next);
        }
        size++;
    }
    
    public void addLast(int bulan, int dt18, int dt19, int dt20) {
        if (isEmpty()) {
            addFirst(bulan, dt18, dt19, dt20);
        } else {
            Pariwisata tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Pariwisata(bulan, dt18, dt19, dt20, null);
        }
        size++;
    }
    
    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.bulan;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Pariwisata tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.bulan;
    }
    
    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Pariwisata tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.bulan;
    }
    
    public void clear() {
        head = null;
        size = 0;
        System.out.println("Semua data berhasil dihapus");
    }
    
    public void print() {
        if (!isEmpty()) {
            Pariwisata tmp = head;
            while (tmp != null) {
                System.out.print(tmp.bulan + "\t\t" + tmp.data18 + "\t" + tmp.data19 + "\t" + tmp.data20);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("========================================");
        } else {
            System.out.println("LinkedList kosong");
        }
    }
}
