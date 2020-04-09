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
public class Queue {

    public int max, size, front, rear, indeks;
    public Nasabah q[];

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        q = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Data Nasabah pada antrian paling depan");
            System.out.println("===========================================================");
            System.out.println("Nama Nasabah \t: " + q[front].nama);
            System.out.println("Nomor Rekening \t: " + q[front].noRekening);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Data Nasabah pada antrian paling belakang");
            System.out.println("===========================================================");
            System.out.println("Nama Nasabah \t: " + q[rear].nama);
            System.out.println("Nomor Rekening \t: " + q[rear].noRekening);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < max; j++) {
            if (q[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void peekPosition(String data) {
        if (!IsEmpty()) {
            int posisi = FindSeqSearch(data);
            if (posisi != -1) {
                System.out.println("Nasabah dengan nama : " + data + " berada pada antrian ke-" + (posisi + 1));
            } else {
                System.out.println("Nasabah dengan nama : " + data + " tidak ada dalam antrian");
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void printNasabah(int position) {
        if (!IsEmpty()) {
            if ((position - 1) >= front || (position - 1) <= rear) {
                System.out.println("Pada antrian ke-" + position + " terdapat data nasabah : ");
                System.out.println("===========================================================");
                System.out.println("Nama Nasabah \t: " + q[position-1].nama);
                System.out.println("Nomor Rekening \t: " + q[position-1].noRekening);
            } else {
                System.out.println("Pada antrian ke-" + position + " tidak terdapat data nasabah");
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("===========================================================");
            int i = front;
            while (i != rear) {
                q[i].print();
                i = (i + 1) % max;
            }
            q[i].print();
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Enqueue(String nama, String noRek) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear].nama = nama;
            q[rear].noRekening = noRek;
            size++;
        }
    }

    public String Dequeue() {
        String data[] = new String[2];
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data[0] = q[front].nama;
            data[1] = q[front].noRekening;
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data[0];
    }
    public void tambah(Nasabah N) {
        if (indeks<q.length) {
            q[indeks] = N;
            indeks++;
        } 
    }
}
