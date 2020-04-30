# Jawaban Pertanyaan 13.3.3 Percobaan Praktikum 1

1. Double Linked Lists memiliki dua buah pointer yaitu pointer next dan prev. Pointer next menunjuk pada node setelahnya dan pointer prev menunjuk pada node sebelumnya. Double memiliki arti field pointer-nya dua buah dan dua arah, ke node sebelum dan sesudahnya. Sedangkan Linked Lists artinya adalah node-node yang saling terhubung satu sama lain. Jadi double linked list adalah node-node yang saling terhubung satu sama lain dan memiliki dua pointer yang menunjuk ke node sebelum dan sesudahnya.

2. Atribut next digunakan untuk menunjuk pada node setelahnya dan atribut prev digunakan untuk menunjuk pada node sebelumnya.

3. kegunaan inisialisasi atribut head dengan null dan size dengan 0 pada konstruktor class DoubleLinkedLists adalah untuk pembuatan awal double linked lists dan menandakan bahwa linked lists masih kosong.

4. Pada method addFirst() pembuatan object dari konstruktor class Node dianggap sama dengan null karena operasi addFirst pada linked lists adalah penambahan node di awal linked lists jadi tidak ada data sebelum data awal ini. Oleh karena itu, pointer prev akan menunjuk pada null.

5. Pada method addFirst() arti dari statement head.prev = newNode adalah pointer prev pada Node head yang lama akan menunjuk ke Node sebelumnya yaitu newNode yang nantinya newNode ini akan menjadi head yang baru.

6. Pada method addLast() arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null adalah pada object Node yang baru pointer prev akan menunjuk pada current yaitu Node terakhir sebelumnya, dan pointer next akan menunjuk ke null yang menandakan bahwa Node baru ini merupakan Node terakhir di dalam linked lists.


# Jawaban Pertanyaan 13.4.3 Percobaan Praktikum 2

1. Pada method removeFirst() terdapat statement:
<img src = 'first.png'>
Maksud statement tersebut adalah menjadikan Node head.next menjadi Node head, kemudian pointer prev pada Node head baru akan menunjuk pada null.

2. Pada method removeLast() cara mendeteksi posisi data pada bagian akhir adalah dengan menggunakan proses traversal yaitu mengunjungi elemen satu persatu dari awal sampai menjumpai null, jika pointer next telah menunjuk ke null maka posisi data sudah berada di bagian akhir.

3. Pada method remove terdapat kode program:
<img src = 'remove.png'>
Fungsi kode program tersebut adalah mengubah current.prev.next menjadi current.next, sehingga Node current diabaikan dan pointer next pada Node sebelum current akan langsung menunjuk pada Node setelah current. Kemudian, mengubah current.next.prev menjadi current.prev, sehingga Node current diabaikan dan pointer prev pada Node setelah current akan langsung menunjuk pada Node sebelum current.


# Jawaban Pertanyaan 13.5.3 Percobaan Praktikum 3

1. Kegunaan method size() pada class DoubleLinkedLists adalah untuk mendapatkan nilai dari atribut size dan jumlah data yang ada di dalam linked lists akan diperbarui secara otomatis.

2. Indeks pada linked lists yang telah dibuat dalam praktikum menunjukkan bahwa linked lists dimulai pada indeks ke-0 dapat dilihat dari method add, remove, dan get bahwa pada perulangannya inisialisasi i=0 dan pada method add terdapat kondisi jika i<0 maka indeks di luar batas, hal itu menunjukkan bahwa indeks linked lists dimulai dari indeks ke-0.

3. Perbedaan fungsi Add pada double linked lists dan single linked lists berada pada pengubahan atribut pointernya. Pada double linked list terjadi 2 perubahan atribut pointer yaitu prev dan next pada penambahan Node baru, sedangkan pada single linked list hanya terjadi 1 perubahan atribut pointer yaitu next pada penambahan Node baru. Perbedaan pada kode program 
Double Linked Lists:
<img src = 'dll.png'>
Single Linked Lists:
<img src = 'sll.png'>



