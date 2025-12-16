# JobSheet 9 - Percobaan 1

## Pertanyaan

 1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
    Apa yang terjadi? Mengapa bisa demikian?
 2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
    pada saat deklarasi array.
 3. Ubah Statement pada No 4 menjadi seperti berikut 
    ![Foto Array](img/Foto%20Array%201.png)
    Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
 4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
    dari program? Mengapa demikian?

## Jawaban

 1. Yang terjadi setelah mengubah elemen array bilangan diubah dengan angka tersebut pada soal ialah mengalami eror, karena tipe data double sedangkan yang dideklarasikan bertipe data integer.<br>
<img width="685" height="567" alt="Screenshot 2025-11-04 112348" src="https://github.com/user-attachments/assets/aa23dce6-4cdb-4b75-ab44-ad2dabcce7fb" />
 2. Berikut hasil modifikasi deklarasi array <br>
<img width="516" height="257" alt="Screenshot 2025-11-08 211630" src="https://github.com/user-attachments/assets/1f7e687a-34fa-4593-bc3c-9a08e2799e2d" />
 3. Keluaran dari program tersebut akan sama, Karena itu adalah perulangan untuk mengeluarkan semua isi index 
 4. Hasil akan tetap keluar tapi pada loop yang ke 4 maka akan keluar error 
    "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
      at ArrayBilangan19.main(ArrayBilangan19.java:11)" maksudnya adalah index 4 tidak ada atau panjang index tidak sampai 4