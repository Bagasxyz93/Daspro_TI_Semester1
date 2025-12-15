# JobSheet 8 - Percobaan 4

## Pertanyaan 

 1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan
mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.
 2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai
tertinggi dan tampilkan nomor kelompok tersebut.

## Jawaban

1. Yang terjadi pada totalNilai di setiap iterasi Outer loop ialah: <br>
- Direset (Di-nol-kan): Variabel diatur ulang ke 0 karena perintah inisialisasi berada di dalam outer loop. <br>
- Digunakan: Perulangan dalam (yang memproses nilai setiap siswa dalam kelompok tersebut) akan menambahkan nilai siswa satu per satu ke dalam totalNilai. <br>
- Dihitung Rata-rata: Setelah perulangan dalam selesai (semua nilai kelompok sudah terjumlah), totalNilai digunakan untuk menghitung rata-rata kelompok.<br>
Mengapa inisialisasinya **total=0** berada di dalam Outer loop? <br>
Karena, program dapat menghitung rata-rata secara terpisah untuk setiap kelompok. <br>
2. Berikut hasil Program setelah dimodifikasi: <br>
> <img width="1567" height="773" alt="Screenshot 2025-10-30 212156" src="https://github.com/user-attachments/assets/6aae27dd-88ee-47a3-8dee-af2f77f1dd9d" />