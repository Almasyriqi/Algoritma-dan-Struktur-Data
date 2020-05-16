package CD_Syifaul;



/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Node<T> {
    
    T judul;
    T distri;
    T stok;
    T rusak;
    int kode;
    Node<T> prev;
    Node<T> next;
    
    Node(Node<T> prev, int kode, T judul, T dis, T st, T rusak, Node<T> next) {
        this.prev = prev;
        this.kode = kode;
        this.judul = judul;
        this.distri = dis;
        this.stok = st;
        this.rusak = rusak;
        this.next = next;
    }
}
