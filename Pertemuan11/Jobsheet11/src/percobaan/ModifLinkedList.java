/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ModifLinkedList {

    ModifNode head;
    int size;

    public ModifLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object item) {
        head = new ModifNode(item, head);
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public void add(Object item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            ModifNode tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            ModifNode next = (tmp == null) ? null : tmp.next;
            tmp.next = new ModifNode(item, next);
        }
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public void addByValue(Object cari, Object item) throws Exception {
        ModifNode tmp = head;
        while (tmp.next != null && tmp.data != cari) {
            tmp = tmp.next;
        }
        if (tmp.data == cari) {
            tmp.next = new ModifNode(item, tmp.next);
            size++;
        }
    }

    public void addLast(Object item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            ModifNode tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new ModifNode(item, null);
        }
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        ModifNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        ModifNode tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            removeFirst();
        } else {
            ModifNode prev = head;
            ModifNode cur = head.next;
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
        ModifNode prev = null;
        ModifNode cur = head;
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        while (cur.next != null && !cur.data.equals(cari)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == head) {
            removeFirst();
        } else {
            if (cur.data.equals(cari)) {
                prev.next = cur.next;
                size--;
                System.out.println("Data berhasil dihapus");
            }
            else {
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
            ModifNode tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void cariIndex(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            ModifNode tmp = head;
            for (int i = 1; i <= index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Indeks ke-" + index + " terdapat data : " + tmp.data);
        }
    }

    public void cariKey(Object key) {
        ModifNode tmp = head;
        while (tmp.next != null && !tmp.data.equals(key)) {
            tmp = tmp.next;
        }
        if (tmp.data.equals(key)) {
            System.out.println("Data " + tmp.data + " ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
