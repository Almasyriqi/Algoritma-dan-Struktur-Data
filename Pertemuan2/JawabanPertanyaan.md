# Jawaban 2.3.3

1. Karakteristik Class dan Objek
Class: diawali dengan huruf kapital dan terdapat method atau fungsi
Objek: harus instansiasi di method  main dan memiliki attribute
2. Kata Kunci Class
Yaitu ditandai dengan kata kunci class
3. Atribut Class Barang
Jumlah atribut 4 yaitu 2 atribut dengan tipe data string dengan nama atribut
namaBarang dan jenisBarang, dan 2 atribut dengan tipe data integer
dengan nama atribut stok dan hargaSatuan. Deklarasi atribut dilakukan 
pada baris ke 15 dan 16.
4. Method Class Barang
Jumlah method 4 yaitu tampilBarang, tambahStok, kurangiStok, hitungHargaTotal.
Deklarasi method dilakukan pada baris 28,35,39, dan 43.
5. Modifikasi Method kurangiStok()
Modifikasi di proyek netbeans StrukturData package minggu2
6. Method tambahStok() 
Dibuat memiliki 1 parameter berupa bilangan int karena method tambahStok() membutuhkan satu masukkan nilai dari luar method berupa bilangan integer untuk diolah di dalam method tersebut.
7. Method hitungHargaTotal() 
Memiliki tipe data int karena method hitungHargaTotal() menghasilkan nilai kembalian dan jenis nilai yang dikembalikan adalah bilangan integer.
8. Method tambahStok() 
memiliki tipe data void karena method tambahStok() tidak menghasilkan nilai kembalian dan tidak ada return pada method tersebut.


# Jawaban 2.4.3

1. Class BarangMain 
Proses instansiasi dilakukan pada baris ke 17 dan nama objek yang dihasilkan adalah b1
2. Akses Atribut dan Method
Atribut: cara mengaksesnya yaitu namaObjek.namaAtribut = nilai yang diakses
contohnya: b1.stok = 10;
Method: cara mengaksesnya yaitu namaObjek.namaMethod(parameter)
contohnya: b1.tampilBarang();  


# Jawaban 2.5.3

1. Deklarasi Konstruktor Class Barang
Deklarasi konstruktor berparameter dilakukan pada baris ke 21 
2. Maksud Kode Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
Yang dilakukan pada baris program tersebut adalah menginstansiasi objek konstruktor berparameter
3. Membuat Objek b3
Jawaban di proyek netbeans StrukturData package minggu1 nama file BarangMain.java


# Jawaban 2.6.3

1. Maksud Kode PersegiPanjang[] ppArray = new PersegiPanjang[3];
Kode tersebut digunakan untuk menginstansiasi objek array dengan nama objek ppArray dan dapat menampung tiga objek PersegiPanjang
2. Maksud Kode: 
ppArray[1] = new PersegiPanjang();
ppArray[1].panjang = 80;
ppArray[1].lebar = 40;
Kode tersebut digunakan untuk mengisikan objek PersegiPanjang ke dalam ppArray indeks ke-1, kemudian memberikan nilai pada atribut panjang = 80 dan lebar = 40


# Jawaban 2.7.3

1. Alasan Error pada kode:
Persegi[] pgArray = new persegi[100];
pgArray[5].sisi = 20;
Terjadi error karena pada indeks pgArray ke-5 belum dibuat objek PersegiPanjang


# Jawaban 2.8.3

1. Pengertian Konstruktor
Konstruktor  merupakan method istimewa yang digunakan untuk membentuk objek, tetapi tidak seperti method yang lain saat deklarasi konstruktor tidak memiliki tipe data, konstruktor hanya bisa dipanggil/dijalankan saat instansiasi, dan nama methodnya sama persis dengan nama class nya
2. Kode untuk Membuat Array Segitiga
Segitiga[] sgArray = new Segitiga[15];
3. Tambah Konstruktor pada Class Segitiga
Jawaban di proyek netbeans ArrayBalok package ArraySegitiga nama file Segitiga.java
4. Tambah Method hitungLuas() dan hitungKeliling()
Jawaban di proyek netbeans ArrayBalok package ArraySegitiga nama file Segitiga.java
5. Mengisi Atribut dan Memanggil Method
Jawaban di proyek netbeans ArrayBalok package ArraySegitiga nama file ArraySegitiga.java