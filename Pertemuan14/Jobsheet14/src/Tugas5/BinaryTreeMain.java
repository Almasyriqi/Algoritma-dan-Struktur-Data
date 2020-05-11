package Tugas5;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class BinaryTreeMain {

    public static void menu() {
        System.out.println("==============================");
        System.out.println("MENU OPERASI BINARY SEARCH TREE");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse inOrder");
        System.out.println("5. Traverse preOrder");
        System.out.println("6. Traverse postOrder");
        System.out.println("7. Keluar");
        System.out.println("==============================");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();

        int pilih, data;
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println("==============================");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data : ");
                    data = sc.nextInt();
                    bt.add(data);
                    break;
                case 2:
                    System.out.print("Masukkan data : ");
                    data = sc.nextInt();
                    bt.delete(data);
                    break;
                case 3:
                    System.out.print("Masukkan data : ");
                    data = sc.nextInt();
                    bt.findData(data);
                    break;
                case 4:
                    System.out.println("Traverse inOrder :");
                    bt.traverseInOrder(bt.root);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Traverse preOrder :");
                    bt.traversePreOrder(bt.root);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Traverse postOrder :");
                    bt.traversePostOrder(bt.root);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Terimakasih telah menggunakan program ini");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih > 0 || pilih < 7);
    }
}
