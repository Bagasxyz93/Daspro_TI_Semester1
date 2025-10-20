# JobSheet5 - Percobaan 3

## Pertanyaan 

 1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
    Mengapa demikian?
 2. Jelaskan maksud dari potongan kode berikut!
    <pre> ```java if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {} ``` </pre>
 3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
    runtut untuk semua kondisi!

## Jawaban

 1. Jika Mahasiswa menjawab "No" Maka akan melanjutkan input selanjutnya lalu akan memunculkan else yang berisi "Gagal! Karena Mahasiswa Masih memiliki tanggungan Kompen".
 2. Potongan kode tersebut adalah adalah if yaitu (Conditional Statement), Fungsi pada potongan di atas jika di artikan adalah "Jika bimbinganP1 Lebih dari atau Sama dengan 8 Dan bimbinganP2 Lebih dari atau Sama dengan 4 maka kode di dalam if akan di jalankan".
 3. Pertama, User disuruh meng-Input apakah Mahasiswa bebas kompen? lalu beberapa input lain yaitu memasukkan sudah berapa kali bimbingan di pembimbing 1 dan 2, Lalu jika di inputan awal user memasukkan Nilai "No" maka akan masuk ke bagaian else yaitu "Gagal! Karena Mahasiswa Masih memiliki tanggungan Kompen", Lalu jika Mahasiswa memasukkan Nilai "Yes" maka akan di lihat kondisinya jika (bimbinganP1 >= 8 && bimbinganP2 >= 4) maka akan muncul pesan "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian Skripsi" Jika (bimbinganP1 < 8 && bimbinganP2 < 4) maka akan muncul pesan "Gagal! Karena Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali" Lalu jika (bimbinganP1 < 8) maka akan muncul peasn "Gagal! Karena Log bimbingan P1 belum mencapai 8 kali" Dan jika tidak dari salah satu di atas atau else maka akan muncul pesan "Gagal! Karena Log bimbingan P2 belum mencapai 4 kali".