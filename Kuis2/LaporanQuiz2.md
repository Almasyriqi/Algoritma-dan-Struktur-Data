# Laporan Quiz 2 Praktikum Algoritma Struktur Data

## NIM : 1941720057 
## Nama : M.Syifa'ul Ikrom Almasyriqi

## Screenshoot kode program :
Class Pariwisata
<img src = 'Pariwisata.png'>
Class LinkedListPariwisata
<img src = 'LinkedLists.png'>
Class PariwisataMain
<img src = 'PariwisataMain.png'>
Output Program
<img src = 'output.png'>

## Flowchart :
Class Pariwisata
<img src = 'fungsiPariwisata.png'>
Pada class pariwisata terdapat atribut data18, data19, data20, bulan, dan next. Terdapat juga konstruktor yang berfungsi untuk mengisi nilai pada atribut.

Class LinkedListPariwisata

<img src = 'linkedlistpariwisata.png'>

Pada class ini terdapat atribut dan konstruktor. Deklarasi atributnya adalah head dan size. Konstruktor digunakan untuk mengisi nilai head dengan null dan size dengan 0 untuk menandakan bahwa linked lists masih kosong.

<img src = 'isempty.png'>

Fungsi isEmpty digunakan untuk mengecek apakah linked list masih kosong dan menggunakan nilai kembalian head yang bertipe data boolean.

<img src = 'addfirst.png'>

Fungsi addFirst digunakan untuk menambah data di awal linked lists.

<img src = 'add.png'>

Fungsi add dimulai dengan mengecek indeks apakah kurang dari nol atau lebih dari size. Jika iya maka akan keluar output index di luar batas. Jika tidak maka akan melakukan penambahan data sesuai indeks yang dimasukkan pada parameter.

<img src = 'addlast.png'>

Fungsi addlast dimulai dengan mengecek fungsi isEmpty, jika isEmpty bernilai true maka akan dilakukan fungsi addFirst, jika tidak maka akan dilakukan penambahan data di akhir linked list.

<img src = 'getfirst.png'>

Fungsi getFirst digunakan untuk mendapatkan data di awal elemen linked lists.

<img src = 'getlast.png'>

Fungsi getLast digunakan untuk mendapatkan data di akhir elemen linked lists.

<img src = 'clear.png'>

Fungsi clear digunakan untuk menghapus semua data yang ada di linked list sehingga linked list kosong.

<img src = 'print.png'>

Fungsi print digunakan untuk mencetak bulan, data di tahun 2018, data di tahun 2019, dan data di tahun 2020.

Class PariwisataMain
<img src = 'main.png'>
Pada class ini dibuat instansiasi objek dari class LinkedListPariwisata yang bernama data dan memanggil beberapa fungsi yang berada di class LinkedListPariwisata yaitu fungsi addFirst, add, addLast, dan print.