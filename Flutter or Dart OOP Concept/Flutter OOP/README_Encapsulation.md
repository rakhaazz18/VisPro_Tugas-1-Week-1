# Encapsulation.dart

File ini berisi contoh konsep enkapsulasi pada Dart.

## Penjelasan Kode
- Properti `_balance` pada `BankAccount` bersifat private, sehingga tidak bisa diakses langsung dari luar class. Ini menjaga keamanan data.
- Method `deposit()` digunakan untuk menambah saldo, dan getter `balance` untuk mengambil nilai saldo dengan cara yang aman.
- Pada fungsi `main`, objek `BankAccount` dibuat, saldo ditambah, dan saldo ditampilkan.

## Mengapa Harus Pakai Enkapsulasi?
- Enkapsulasi menjaga data agar tidak diakses atau diubah sembarangan dari luar class.
- Membantu menjaga integritas dan keamanan data.
- Memudahkan maintenance dan pengembangan kode karena akses data lebih terkontrol.
