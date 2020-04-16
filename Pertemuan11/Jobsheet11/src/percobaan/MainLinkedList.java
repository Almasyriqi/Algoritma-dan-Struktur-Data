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
public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        
        try {
            data.addFirst(7);
            data.print();
            data.add(8, 1);
            data.print();
            data.addFirst(1);
            data.print();
            data.remove(1);
            data.print();
            data.clear();
            data.print();
            
//            data.addFirst(20);
//            data.add(8, 1);
//            data.addLast(4);
//            data.addByValue(8, 15);
//            data.removeByValue(8);
//            data.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
