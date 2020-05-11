package Tugas6;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        BinaryTreeArray bta = new BinaryTreeArray(10, idxLast);
        
        for (int i = 0; i < 10; i++) {
            bta.add(data[i]);
        }
        
        System.out.println("==================================");
        System.out.println("Traverse InOrder : ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.println("Traverse PreOrder : ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("Traverse PostOrder : ");
        bta.traversePostOrder(0);
        System.out.println("");
        System.out.println("==================================");
    }
}
