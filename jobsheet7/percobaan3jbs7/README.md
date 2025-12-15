# JobSheet 7 - Percobaan 3

## Pertanyaan 

 1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
 2.  Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
 3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
 4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?

## Jawaban

1. Pada struktur do-while, perintah di dalam blok do { ... } selalu dijalankan minimal satu kali, meskipun kondisi di bagian while bernilai salah sejak awal.
Artinya, jika pada input pertama pengguna langsung mengetik “batal”, maka perulangan tetap dijalankan satu kali. Program akan menampilkan pesan “Transaksi dibatalkan.”
<img width="807" height="102" alt="Screenshot 2025-10-24 092348" src="https://github.com/user-attachments/assets/db87307a-4fc0-4237-9b78-f26aca5e36c1" />
<br>
3. Kondisi berhenti dalam program tersebut adalah ketika pengguna mengetikkan kata “batal” pada input nama pelanggan. Dikarekan adanya "break;" berfungsi untuk menghentikan perulangan secara paksa, meskipun kondisi while masih bernilai benar. <br>
4. Nilai true berarti kondisi selalu benar, sehingga perulangan do-while akan berjalan tanpa batas (infinite loop) selama tidak ada instruksi yang menghentikannya secara manual.
Namun, agar program tidak benar-benar berjalan tanpa akhir, digunakan perintah break sebagai pengontrol utama untuk keluar dari perulangan. <br>
5. Hal ini karena do-while bekerja berdasarkan logika kondisi yang diperiksa di bagian while, bukan dari penghitung angka seperti pada perulangan for.
Pada program tersebut, selama kondisi true tetap bernilai benar, perulangan akan terus dijalankan. Tidak adanya inisialisasi atau update tidak menjadi masalah, karena kontrol perulangan dilakukan melalui input pengguna (yakni mengetik “batal”), bukan dari variabel penghitung. <br>