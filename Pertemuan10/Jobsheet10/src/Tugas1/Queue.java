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
public class Queue {

    public int max, size, front, rear;
    public int[] Q;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
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
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang: " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < max; j++) {
            if (Q[j] == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void peekPosition(int data) {
        if (!IsEmpty()) {
            int posisi = FindSeqSearch(data);
            if (posisi != -1) {
                System.out.println("Elemen : " + data + " berada pada indeks ke-" + posisi);
            }
            else {
                System.out.println("Data tidak ada dalam antrian");
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekAt(int position) {
        if (!IsEmpty()) {
            if (position >= front && position <= rear) {
                System.out.println("Pada indeks ke-" + position + " terdapat data elemen : " + Q[position]);
            }
            else {
                System.out.println("Pada indeks ke-" + position + " tidak terdapat data");
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Enqueue(int data) {
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
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
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
        return data;
    }
}
