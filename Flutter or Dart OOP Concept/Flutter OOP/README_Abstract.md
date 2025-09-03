# Abstract.dart

File ini berisi contoh konsep abstract class pada Dart.

## Penjelasan Kode
- Kelas `Animal` adalah abstract class, artinya tidak bisa langsung dibuat objeknya dan hanya berfungsi sebagai blueprint untuk kelas turunannya.
- Method `makeSound()` adalah abstract, sehingga setiap turunan wajib mengimplementasikan method ini.
- Kelas `Dog` mengimplementasikan method `makeSound()` sesuai perilaku anjing.
- Pada fungsi `main`, objek `Dog` dibuat dan method `makeSound()` dipanggil.

## Mengapa Harus Pakai Abstract Class?
- Abstract class digunakan untuk mendefinisikan struktur dasar yang harus diikuti oleh semua turunannya.
- Membantu menjaga konsistensi dan memaksa turunan untuk mengimplementasikan method penting.
- Cocok digunakan jika ada beberapa kelas yang punya perilaku dasar yang sama tapi implementasi berbeda.
