package Tugas1_2_3_4;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        // Tugas nomor 1
        // menambahkan data secara rekursif
        bt.insert(11);
        bt.insert(17);
        bt.insert(20);
        bt.insert(16);
        bt.insert(21);
        
        // menambahkan data secara iteratif
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        // Tugas nomor 2
        // menampilkan nilai paling kecil dan paling besar dalam tree
        System.out.println("Nilai paling kecil : " + bt.findMin(bt.root));
        System.out.println("Nilai paling besar : " + bt.findMax(bt.root));
        // Tugas nomor 3
        // menampilkan data yang ada di leaf
        System.out.println("Data yang ada di leaf : ");
        bt.printLeaf(bt.root);
        System.out.println("");
        // Tugas nomor 4
        // menampilkan jumlah leaf dalam tree
        System.out.println("Jumlah leaf : " + bt.getLeafCount(bt.root));
    }
}
