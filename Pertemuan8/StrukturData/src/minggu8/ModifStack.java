/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class ModifStack {

    public Scanner sc = new Scanner(System.in);
    public int size;
    public int top, pilih;
    public int data[];

    public ModifStack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen teratas: " + data[top]);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Isi stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }

    public void menu() {
        System.out.println("--------------------------------------");
        System.out.println("\t\tDaftar menu");
        System.out.println("--------------------------------------");
        System.out.println("1. Push data");
        System.out.println("2. Pop data");
        System.out.println("3. Print data");
        System.out.println("4. Peek data");
        System.out.println("5. Keluar");
        System.out.println("--------------------------------------");
        System.out.print("Pilih menu : ");
        pilih = sc.nextInt();
    }

    void pilihmenu() {
        switch (pilih) {
            case 1:
                System.out.print("Push data : ");
                int masuk = sc.nextInt();
                push(masuk);
                break;
            case 2:
                pop();
                break;
            case 3:
                print();
                break;
            case 4:
                peek();
                break;
            case 5:
                System.out.println("Terimakasih telah menggunakan program ini");
                System.exit(0);
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
