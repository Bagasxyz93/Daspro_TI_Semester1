# JobSheet 7 - Percobaan 2

## Pertanyaan 

 1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:

    if(nilai < 0 || nilai > 100){
        System.out.println("Nilai tidak valid. Masukkan Lagi nilai yang valid.");
        continue;
    }

a. nilai < 0 || nilai > 100
b. continue

 2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
 3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
 4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
 5. Commit dan push kode program ke Github

## Jawaban

 1. **nilai < 0 || nilai > 100** ialah kondisi logika yang memeriksa apakah nilai yang dimasukkan tidak berada dalam rentang 0–100.
> nilai < 0 berarti nilai lebih kecil dari 0 
> (terlalu rendah / tidak masuk akal).

> nilai > 100 berarti nilai lebih besar dari 100 
> (terlalu tinggi / tidak mungkin).

> Tanda || (dibaca “or”) artinya salah satu dari dua
> kondisi itu benar, maka hasilnya akan bernilai
> benar (true).
- **continue** ialah perintah kontrol dalam perulangan yang digunakan untuk melewatkan sisa kode di dalam loop dan langsung melanjutkan ke iterasi berikutnya. Agar input yang tidak valid tidak diproses lebih lanjut, dan program langsung meminta input baru dari pengguna. <br>

2. Karena kita ingin agar perintah dalam perulangan dijalankan dulu untuk nilai i saat ini, baru kemudian variabel penghitung dinaikkan untuk iterasi berikutnya.
Dengan menulis i++ di akhir, program memastikan bahwa setiap data (misalnya setiap mahasiswa) diproses secara berurutan mulai dari yang pertama hingga terakhir. <br>

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, maka perulangan akan berjalan sebanyak 19 kali. Hal ini karena perulangan dimulai dari i = 1 dan akan terus berjalan selama kondisi i <= 19 bernilai benar. <br>