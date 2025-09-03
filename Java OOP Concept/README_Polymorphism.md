# Polymorphism.java

File ini berisi contoh konsep polymorphism pada Java.

## Penjelasan Kode
- Kelas `Animal` punya method `makeSound()` yang bisa dioverride oleh turunannya.
- Kelas `Cat` mengoverride method tersebut dengan perilaku khusus.
- Pada fungsi `main`, objek bertipe `Animal` tapi instance-nya adalah `Cat`, sehingga method yang dipanggil adalah milik `Cat`.

## Mengapa Harus Pakai Polymorphism?
- Polymorphism memungkinkan satu interface digunakan untuk berbagai tipe objek.
- Memudahkan pengembangan kode yang fleksibel dan scalable.
- Kode lebih mudah diperluas tanpa mengubah struktur yang sudah ada.
