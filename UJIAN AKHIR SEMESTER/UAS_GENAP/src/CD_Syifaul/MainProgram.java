package CD_Syifaul;

import java.util.Scanner;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class MainProgram {

    public static void menu() {
        System.out.println("Pilih menu");
        System.out.println("1. CD Masuk");
        System.out.println("2. CD Keluar");
        System.out.println("3. CD Rusak");
        System.out.println("4. Tampilkan semua data");
        System.out.println("5. Cari berdasarkan kode");
        System.out.println("6. Cari berdasarkan judul");
        System.out.println("7. Exit");
        System.out.print("Masukkan pilihan menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();

        int pilih, kode, stok, rusak, index;
        String judul, dis;
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println("====================================================");
            try {
                switch (pilih) {
                    case 1:
                        if (dll.isEmpty()) {
                            System.out.println("Masukkan CD Baru");
                            System.out.print("Kode : ");
                            kode = sc.nextInt();
                            System.out.print("Judul : ");
                            judul = sc2.nextLine();
                            System.out.print("Distributor : ");
                            dis = sc2.nextLine();
                            System.out.print("Jumlah stok : ");
                            stok = sc.nextInt();
                            System.out.print("Jumlah rusak : ");
                            rusak = sc.nextInt();
                            dll.addLast(kode, judul, dis, stok, rusak);
                        } else {
                            System.out.println("Update stok CD");
                            System.out.print("Kode : ");
                            kode = sc.nextInt();
                            System.out.print("Judul : ");
                            judul = sc2.nextLine();
                            System.out.print("Distributor : ");
                            dis = sc2.nextLine();
                            System.out.print("Jumlah stok : ");
                            stok = sc.nextInt();
                            System.out.print("Jumlah rusak : ");
                            rusak = sc.nextInt();
                            dll.addLast(kode, judul, dis, stok, rusak);
                        }
                        System.out.println("====================================================");
                        break;
                    case 2:
                        System.out.print("Masukkan indeks : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        System.out.println("====================================================");
                        break;
                    case 3:
                        System.out.print("Masukkan index CD rusak : ");
                        index = sc.nextInt();
                        System.out.print("Jumlah : ");
                        rusak = sc.nextInt();
                        dll.add(dll.get(index), dll.get2(index), dll.get3(index), dll.get4(index), rusak, index);
                        System.out.println("====================================================");
                        break;
                    case 4:
                        dll.print();
                        System.out.println("====================================================");
                        break;
                    case 5:
                        System.out.print("Masukkan kode yang ingin dicari : ");
                        kode = sc.nextInt();
                        dll.cari(kode);
                        System.out.println("====================================================");
                        break;
                    case 6:
                        System.out.print("Masukkan judul yang ingin dicari : ");
                        judul = sc2.nextLine();
                        dll.cari2(judul);
                        System.out.println("====================================================");
                        break;
                    case 7:
                        System.out.println("Terimakasih telah menggunakan program ini");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih > 0 || pilih <= 7);
    }
}
