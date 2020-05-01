package Tugas3;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class DaftarNilaiMain {
    public static void main(String[] args) {
        
        DaftarNilai dn = new DaftarNilai();
        
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("------------------------------------");
        System.out.println("Nama \t\t|Nilai");
        System.out.println("------------------------------------");
        try {
            dn.addFirst("Adeline Wong", 84);
            dn.addLast("Tiara Chandra", 76);
            dn.addLast("M. Syifa'ul", 90);
            dn.addLast("Daffa Pratama", 85);
            dn.addLast("Diva Ardhia", 91);
            dn.addLast("Ardy Cahya", 81);
            dn.addLast("Alvin Rizky", 77);
            dn.addLast("Putra Sulung", 86);
            dn.addLast("Putri Anggun", 88);
            dn.addLast("Dimas Seno", 85);
            dn.add("Fila Dharma", 87, 3);
            dn.print();
            System.out.println("------------------------------------");
            dn.selectionSort();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Setelah diurutkan secara Descending");
        System.out.println("------------------------------------");
        System.out.println("Nama \t\t|Nilai");
        System.out.println("------------------------------------");
        dn.print();
        System.out.println("------------------------------------");
        dn.clear();
    }
}
