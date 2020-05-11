package Tugas6;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class BinaryTreeArray {

    int[] dataTree;
    int idxLast;

    public BinaryTreeArray(int max, int idxLast) {
        dataTree = new int[max];
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(dataTree[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void add(int data) {
        if (dataTree[0] == 0) {
            dataTree[0] = data;
        }
        int idx = 0;
        
        while(true) {
            if(data < dataTree[idx]){
                // insert left child
                if (dataTree[2*idx+1]!=0){
                    idx = (2*idx)+1;
                }else{
                    dataTree[2*idx+1] = data;
                    break;
                }
            }else if (data > dataTree[idx]){
                // insert right child
                if (dataTree[2*idx+2]==0){
                    dataTree[2*idx+2] = data;
                    break;
                }else{
                    idx=2*idx+2;
                }
            }else {
                break;
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(dataTree[idxStart] + " ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(dataTree[idxStart] + " ");
        }
    }
}
