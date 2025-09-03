# Class & Object.dart

File ini berisi contoh dasar konsep class dan object pada Dart.

## Penjelasan Kode
- Kelas `Person` digunakan untuk mendefinisikan tipe data baru yang merepresentasikan seseorang, dengan properti `name` dan `age`. Dengan class, kita bisa membuat blueprint untuk objek nyata di dunia nyata.
- Constructor `Person(this.name, this.age)` digunakan agar setiap objek yang dibuat harus memiliki nama dan umur. Ini penting agar data yang dimiliki setiap objek konsisten dan valid.
- Method `introduce()` berfungsi untuk menampilkan informasi dari objek. Dengan method, kita bisa memberikan perilaku pada objek.
- Pada fungsi `main`, dibuat dua objek `Person` dengan data berbeda. Setiap objek bisa memanggil method `introduce()` sesuai data yang dimilikinya.

## Mengapa Harus Pakai Class & Object?
- Class dan object adalah pondasi OOP (Object Oriented Programming). Dengan class, kita bisa membuat struktur data yang kompleks dan reusable.
- Object memungkinkan kita membuat banyak instance dari satu blueprint, sehingga kode lebih efisien dan mudah dikelola.
- Dengan OOP, kode lebih mudah dikembangkan, diuji, dan dipelihara.
