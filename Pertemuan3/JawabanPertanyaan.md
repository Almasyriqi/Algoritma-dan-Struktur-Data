# Jawaban 2.3.3

1. Base Line Algoritma Divide Conquer 
untuk pencarian nilai faktorial ditandai dengan adanya kondisi yang dapat mengakhiri perulangan pemanggilan fungsi rekursif (menghentikan recursion call) yaitu kondisi n==1, jika kondisi ini memenuhi maka recursion call akan dihentikan dan nilai akan dikembalikan ke 1.
2. Implementasi Algoritma Divide and Conquer Faktorial
Lengkap terdiri dari 3 tahapan yaitu divide, conquer, dan combine. Pada kode program: 
int fakto = n * faktorialDC(n-1); merupakan tahapan divide dan conquer karena pada tahapan ini masalah faktorial dibagi menjadi beberapa bagian dan menghitung setiap solusi dari masalah yang telah dibagi tadi. Kemudian, pada kode program:
return fakto; merupakan tahapan combine karena solusi yang telah dibagi tadi menjadi solusi masalah semula atau menggabungkan setiap solusi yang telah dibagi tadi.
3. Perulangan pada Method faktorialBF()
memungkinkan untuk dirubah selain menggunakan for. Pembuktian di proyek netbeans AlgoStruDat package minggu3 nama file Faktorial.java
4. Tambah Pengecekan Waktu Eksekusi
di proyek netbeans AlgroStruDat package minggu3 nama file MainFaktorial.java
5. Pembuktian di proyek netbeans AlgoStruDat package minggu3 nama file MainFaktorial.java
jika inputan elemen di atas 20 angka, maka ada perbedaan waktu eksekusi dengan perbedaan waktu 12 milidetik lebih cepat method faktorialDC() daripada eksekusi method faktorialBF()


# Jawaban 2.4.3

1. Perbedaan Method PangkatBF() dan PangkatDC()
PangkatBF(): Menggunakan algoritma brute force, Menggunakan fungsi iterasi, dan menghitung hasil pangkat menggunakan perulangan for.
PangkatDC(): Menggunakan algoritma divide and conquer, menggunakan fungsi rekursif, dan menghitung hasil pangkat dengan memanggil fungsi itu sendiri sampai memenuhi base line.
2. Arti potongan kode
if (n%2==1) { //bilangan ganjil
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            }
            else { //bilangan genap
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
Jika nilai pemangkat dimodulus 2 = 1, maka termasuk bilangan ganjil dan akan memberikan nilai kembalian yang merupakan recursion call pangkatDC(a,n/2)*pangkatDC(a,n/2)*a, dikali dengan a agar jumlah perkalian dapat ganjil. Sedangkan, jika nilai pemangkat dimodulus 2 != 1, maka termasuk bilangan genap dan akan memberikan nilai kembalian yang merupakan recursion call pangkatDC(a,n/2)*pangkatDC(a,n/2) di kode ini tidak ada perkalian dengan a agar jumlah perkalian dapat genap.
3. Tahap Combine 
sudah termasuk dalam kode tersebut. Yaitu pada kode return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a); dan return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
4. Modifikasi Kode program
dengan pengisian atribut dilakukan konstruktor, jawaban di proyek netbeans AlgoStruDat package minggu3 nama file ModifPangkat.java dan ModifMainPangkat.java
5. Tambah Menu
jawaban di proyek netbeans AlgoStruDat package minggu3 nama file ModifMainPangkat.java


# Jawaban 2.5.3

1. Perbedaan Perhitungan Keuntungan
Method TotalBF(): menggunakan perulangan dengan cara menambahkan variabel total dengan elemen array yang diinputkan sebelumnya. Hal itu berulang terus sampai batas yang telah ditentukan. Contoh batasnya adalah jumlah bulan misalnya 5 bulan, maka penjumlahan variabel total dengan elemen array akan dilakukan sebanyak 5 kali.
Method TotalDC(): Misalnya bulan yang kita masukan = 5, keuntungan = {1,2,3,4,5}
Jadi perhitungan keuntungan dibagi manjadi 2 bagian bagian kiri lsum
dan bagian kanan rsum ,yang akan saya jabarkan sebagai berikut :
• Lsum = 1, 2 dan rsum = 4, 5, kemudian nilai mid (tengah) = 3
• Di lsum melakukan perhitungan 1+2 = 3
• Di rsum melakukan perhitungan 4+5 = 9
Kemudian direturn dengan menjumlahkan lsum+rsum+arr[mid] =
3+9+3 = 15 (hasil akhir).
2. Cara membatasi output di belakang koma agar menjadi standar
dengan cara mengubah syntax System.out.println dengan System.out.printf kemudian menambahkan %.2f di dalam syntax tersebut. Contohnya seperti ini:
System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f", sm.totalBF(sm.keuntungan));
3. Formula return value:
return lsum+rsum+arr[mid]; Formula ini digunakan untuk tahapan combine di algoritma divide and conquer, dimana combine ini digunakan untuk menggabungkan kembali masalah yang telah dibagi sebelumnya dan mengembalikan nilai yang merupakan hasil akhir dari perhitungan tersebut.
4. Variabel mid pada method TotalDC()
dibutuhkan saat tahap divide pada algoritma divide and conquer agar dapat mendapat nilai tengah dari jumlah data yang ganjil dan memudahkan proses divide jika jumlah datanya ganjil.
5. Modifikasi program agar bisa lebih dari satu perusahaan
jawaban di proyek netbeans package minggu3 nama file