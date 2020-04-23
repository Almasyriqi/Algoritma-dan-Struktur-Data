/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class PariwisataMain {

    public static void main(String[] args) {

        LinkedListPariwisata data = new LinkedListPariwisata();
        
        System.out.println("Quiz 2 Praktikum ASD");
        System.out.println("Program data pariwisata dengan Linked Lists");
        System.out.println("========================================");
        System.out.println("Bulan ke-\t" + "2018\t" + "2019\t" + "2020");
        System.out.println("========================================");
        try {
            data.addFirst(1, 475544, 2343240, 2845672);
            data.add(2, 1985572, 2546836, 3456566, 1);
            data.add(3, 2076432, 2436456, 2341653, 2);
            data.add(4, 2165239, 1943656, 2734562, 3);
            data.add(5, 2283546, 2453425, 2534400, 4);
            data.add(6, 2344460, 2754240, 2346307, 5);
            data.add(7, 2635040, 3256404, 943734, 6);
            data.add(8, 2958672, 3454645, 2234544, 7);
            data.add(9, 3047626, 3698200, 2398636, 8);
            data.add(10, 2843543, 4138479, 2345346, 9);
            data.add(11, 2734526, 3743756, 1546256, 10);
            data.addLast(12, 2523400, 3398320, 2453435);
            data.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
