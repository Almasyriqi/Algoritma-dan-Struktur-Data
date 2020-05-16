package CD_Syifaul;

/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class DoubleLinkedLists {

    Node head;
    int kode, stok;
    String judul, dis;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int kode, String judul, String dis, int stok) {
        int rusak = 0;
        if (isEmpty()) {
            head = new Node(null, kode, judul, dis, stok,rusak, null);
        } else {
            Node newNode = new Node(null, kode, judul, dis, stok, rusak,head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int kode, String judul, String dis, int stok, int rusak) {
        if (isEmpty()) {
            addFirst(kode, judul, dis, stok);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, kode, judul, dis, stok, rusak, null);
            current.next = newNode;
            size++;
        }
    }
    
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.kode;
    }
    
    public Object get2(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.judul;
    }
    
    public Object get3(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.distri;
    }
    
    public Object get4(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.stok;
    }

    public void add(int kode, Object judul, Object dis, Object stok,Object rusak, int index) throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked list masih kosong");
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null,  kode, judul, dis, stok, rusak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev,  kode, judul, dis, stok, rusak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
        remove(index + 1);
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            int i=0;
            System.out.println("Index \t Kode \t Judul \t\t Distributor \t\t stok \t Rusak");
            while (tmp != null) {
                System.out.print(i + " \t " + tmp.kode + " \t " + tmp.judul + " \t\t " + tmp.distri + " \t\t " + tmp.stok + " \t " + tmp.rusak);
                tmp = tmp.next;
                i++;
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data berhasil dihapus");
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("Data berhasil dihapus");
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            System.out.println("Data berhasil dihapus");
        }
    }

    public void cari(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp.next != null && tmp.kode==key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp.kode==key) {
            System.out.println("Data " + key + " ditemukan pada indeks ke: " + index);
            System.out.println("========================================");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public void cari2(String key) {
        Node tmp = head;
        int index = 0;
        while (tmp.next != null && tmp.judul.equals(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp.judul.equals(key)) {
            System.out.println("Data " + key + " ditemukan pada indeks ke: " + index);
            System.out.println("========================================");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
