# (13) Map Data Structure

### Array
Salah satu struktur data yang sering digunakan dalam pemrograman adalah Array.Array merupakan struktur data yang digunakan untuk menyimpan sekumpulan data dalam satu tempat.Setiap data dalam Array memiliki indeks, sehingga kita akan mudah memprosesnya.Indeks array selalu dimulai dari angka nol (0).Pada teori struktur data ukuran array akan bergantung dari banyaknya data yang ditampung di dalamnya.

### Arraylist
Untuk menyimpan data dalam Array, maka harus mendeklarasikan jumlah elemen maksimalnya. Sehingga penggunaan Array tidak digunakan jika jumlah datanya fleksibel. Sedangkan ArrayList dapat menampung sejumlah data secara dinamis.Deklarasi ArrayList : List namaArrayList = new ArrayList<>();.Untuk mengetahui jumlah data yang terdapat dalam suatu ArrayList dapat menggunakan method size().

    List listProgram = new ArrayList<>();
    listProgram.add("Java");
    listProgram.add("PHP");
    listProgram.add("Web Design");
    
    System.out.println("Jumlah Data "+listProgram.size());
listProgram.add("Java"); digunakan untuk memasukkan value kedalam ArrayList. Kemudian bagaimana jika kita ingin menghapus isi dari ArrayList tersebut. Perhatikan contoh berikut Untuk melakukan penghapusan salah satu dari value di ArrayList gunakan method remove(Object o) atau remove(int index).

    listProgram.remove("Java");
atau
    listProgram.remove(0);
Kedua cara diatas dapat kalian gunakan untuk melakukan remove atau menghapus salah satu dari value ArrayList.Method remove(Object o) akan menghapus value ArrayList berdasarkan object. Sedangkan remove(int index) akan menghapus value ArrayList berdasarkan urutan index dalam ArrayList tersebut.Untuk menghapus seluruh value yang terdapat pada ArrayList dapat menggunakan method clear().

    listProgram.clear();

### HashMap
Class HashMap merupakan class turunan dari class AbstractMap dan implementasi dari interface Map.HashMap adalah sebuah class yang berisi sekumpulan pasangan nilai (value) dan kunci (key).Nilai bisa dalam bentuk string, integer, boolean, float, double, dan objek. Sedangkan untuk key biasanya dalam bentuk string dan integer.HashMap bisa dibilang seperti Array asosiatif dalam Java.

Cara Membuat HashMap
Sebelum bisa menggunakan HashMap, kita harus mengimpornya terlebih dahulu:

    import java.util.HashMap;
Setelah itu baru kita bisa menggunakannya. Nah!, untuk menggunakan HashMap, kita harus membuat objeknya terlebih dahulu. Objek dari Hashmap dapat dibuat dengan kata kunci new. Namun, ada sedikit tambahan untuk menentukan tipe data untuk key dan value yang akan disimpan.

    HashMap<Integer, String> days = new HashMap<Integer,String>
Mengisi Nilai ke HashMap
Tadi kita sudah membuat objek hashmap bernama days dengan tipe data:

K (key): Integer
V (value): String Untuk mengisi nilai ke objek days, kita dapat menggunakan method put seperti ini:
days.put(1, "Minggu");
days.put(2, "Senin");
days.put(3, "Selasa");
days.put(4, "Rabu");
days.put(5, "Kamis");
days.put(6, "Jum'at");
days.put(7, "Sabtu");