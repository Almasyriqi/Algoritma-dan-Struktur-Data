package Tugas1;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class DoubleLinkedListsMain {

    public static void menu() {
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Keluar");
        System.out.println("==============================");
        System.out.print(">> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();

        int pilih, data, index;
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println("==============================");
            try {
                switch (pilih) {
                    case 1:
                        System.out.println();
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addFirst(data);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addLast(data);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        System.out.print("Masukkan Posisi indeks data : ");
                        index = sc.nextInt();
                        dll.add(data, index);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
                        dll.removeFirst();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println();
                        dll.removeLast();
                        System.out.println();
                        break;
                    case 6:
                        System.out.println();
                        System.out.print("Masukkan indeks : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        System.out.println();
                        break;
                    case 7:
                        System.out.println();
                        dll.print();
                        System.out.println();
                        break;
                    case 8:
                        System.out.println();
                        System.out.print("Masukkan data yang ingin dicari : ");
                        data = sc.nextInt();
                        dll.cari(data);
                        System.out.println();
                        break;
                    case 9:
                        System.out.println("Terimakasih telah menggunakan program ini");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih > 0 || pilih <= 9);
    }
}
