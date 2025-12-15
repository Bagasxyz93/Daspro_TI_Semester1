# JobSheet 7 - Percobaan 1

## Pertanyaan 

 1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
 2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
 3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
 if(nilai > tertinggi){
    tertinggi=nilai;
 }
 if(nilai < terendah>){
    terendah=nilai;
 }
 4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
 5. Commit dan push kode program ke Github

## Jawaban

1. Masing-masing komponen yang ada pada perulangan FOR pada program ke 1 ialah: 
- Inisialisasi → int i = 1
Bagian ini memberikan nilai awal pada variabel penghitung i.
Artinya, perulangan dimulai dari mahasiswa ke-1.
- Kondisi → i < 10
Perulangan akan terus berjalan selama nilai i kurang dari 10.
Jadi, program akan meminta input nilai mahasiswa ke-1 hingga ke-9 (total 9 mahasiswa).
- Increment → i++
Setelah satu kali perulangan selesai, nilai i akan bertambah 1.
Hal ini memastikan perulangan berjalan secara berurutan dari mahasiswa ke-1 sampai ke-9.
<br>

2. Alasan variabel tertinggi diinisialisasikan 0 dan terendah diinisialisasikan 100 ialah tertinggi = 0 → diasumsikan tidak ada nilai mahasiswa yang lebih kecil dari 0.
Dengan inisialisasi ini, ketika program membaca nilai pertama, otomatis nilai tersebut akan lebih besar dari 0 dan menggantikan nilai tertinggi. sedangkan terendah = 100 → diasumsikan tidak ada nilai yang melebihi 100.
Maka, nilai pertama yang dimasukkan pasti lebih kecil dari 100 dan akan menggantikan nilai terendah.
<br>

3. Penjelasan alur kerja kode
- Program menerima input nilai baru melalui variabel nilai.
**kondisi pertama:** <br>
> if (nilai > tertinggi) <br>
Artinya: jika nilai yang baru dimasukkan lebih besar dari nilai tertinggi sebelumnya, maka nilai tertinggi tersebut diperbarui menjadi nilai yang baru:
> tertinggi = nilai; <br>
Dengan cara ini, tertinggi akan selalu menyimpan nilai paling besar dari seluruh data yang sudah dimasukkan sejauh ini. 
<br>

**Kondisi kedua**
> if (nilai < terendah)
Artinya: jika nilai yang baru dimasukkan lebih kecil dari nilai terendah sebelumnya, maka nilai terendah tersebut diperbarui menjadi nilai yang baru: <br>
> terendah = nilai;
Dengan cara ini, terendah akan selalu menyimpan nilai paling kecil dari semua data yang sudah dimasukkan.
<br>