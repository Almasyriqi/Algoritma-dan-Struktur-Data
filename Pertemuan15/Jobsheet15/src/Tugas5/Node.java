package Tugas5;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Node {
    int data;
    int weight;
    Node prev;
    Node next;
    
    Node(Node prev, int data, int weight, Node next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}
