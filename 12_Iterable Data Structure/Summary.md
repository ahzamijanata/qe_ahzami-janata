# (12) Iterable Data Structure

Di dalam komputer/pemrograman, iterasi adalah sifat tertentu dari algoritma atau program komputer di mana suatu urutan atau lebih dari langkah algoritmik dilakukan di loop program. Hal ini dibedakan dari teknik berulang yang disebut rekursi.

Di dalam matematika, iterasi dapat diartikan sebagai suatu proses atau metode yang digunakan secara berulang-ulang (pengulangan) dalam menyelesaikan suatu permasalahan matematik.

### Collection pada Java

Collection adalah suatu objek yang bisa digunakan untuk menyimpan sekumpulan objek. Classclass Collection diletakkan dalam package java.util dan mempunyai dua interface utama yaitu Collection dan Map. Collection terbagi menjadi 3 kelompok yaitu Set, List dan Map. 
1) Set
Set adalah jenis array yang tidak membolehkan adanya value duplicate, saat ada insert value yang sudah ada sebelumnya, maka value itu akan terotomatisasi dibuang salah satunya dan akhirnya value tersebut hanya tetap ada satu saja. Set juga memiliki beberapa fungsi yang cukup membantu, seperti clear(), add (Object e), remove(Object e) dan masih banyak lagi fungsi-fungsi lainnya jika teman-teman ingin lebih mengeksplorasi sendiri. 
2) List
List adalah jenis array yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda. List memiliki beberapa fungsi-fungsi yang cukup membantu dalam proses pengolahan nilai-nilai seperti fungsi clear() untuk menghapus semua element atau value pada list, melakukan insert value pada index element tertentu dengan fungsi add(int index, Object element), menghapus value pada index element tertentu dengan fungsi remove(int index) dan masih banyak lagi fungsi lainnya yang mungkin bisa menjawab sesuai kebutuhan kita. 
3) Map
Map adalah jenis array yang indexnya tidak hanya nilai integer 0,1,2 dan seterusnya, melainkan kita dapat melakukan custom pada nilai indexnya, asalkan nilai indexnya adalah selalu unik. Pada jenis array ini masih memiliki kemungkinan terdapat value yang sama (duplicate), karena pada Map ini lebih menekankan index yang harus unik. Jika di dalam pemrograman PHP, kita sering juga menyebut tipe array berjenis ini adalah array asosiatif, selalu memiliki index atau key kemudian value. Map juga memiliki fungsi-fungsi yang cukup membantu seperti clear(), put(Object key, Object value), containsKey(Object key) yaitu mengecek apakah ada elemen pada Map berdasarkan Key atau indexnya, containsValue(Object value) yaitu mengecek apakah ada elemen pada Map berdasarkan Value. 

### Queue
Dalam perkuliahan Struktur Data (Data Structure) pasti mendapatkan Queue (setelah stack tentunya). Jadi Queue adalah salah satu implementasi dari linked list. Queue menerapkan konsep FIFO (First In First Out) atau FCFS (First Come, First Serve). Berbeda dengan Stack yang menerapkan konsep LIFO (Last In, First Out). Simplenya, yaa seperti jika kita mengantri untuk membeli sesuatu. Begitulah konsep dari Queue.

https://docs.google.com/document/d/15CoKbM1zVTeGT_Sugqy4OvggD7wuYAOx7qRdna6IiB4/edit?usp=sharing
