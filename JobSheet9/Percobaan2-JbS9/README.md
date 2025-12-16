# JobSheet 9 - Percobaan 2

## Pertanyaan

 1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
    for(int i = 0; i < nilaiAkhir.length; i++){
        System.out.println("Masukkan nilai akhir ke-"+i+" :");
        nilaiAkhir[i] = sc.nextInt();
    }
    Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
 2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
 3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai
> 70):
![Foto](img/image.png)
Jalankan program dan jelaskan alur program!
 4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
seperti ilustrasi output berikut:
![alt text](img/image-1.png)

## Jawaban

1. Adanya perubahan pada kode "10" yang diubah menjadi "nilaiAkhir.length" dimana saat program dijalankan hasilnya tetap sama yaitu menginput banyak nya nilai akhir. Namun yang membedakan ialah "nilaiAkhir.length" Menyesuaikan jumlah iterasi dengan panjang array yang sebenarnya. Sedangkan "10" angka tetap sehingga Memaksa iterasi sebanyak 10 kali, terlepas dari ukuran array. <br>
<img width="623" height="898" alt="Screenshot 2025-11-08 213148" src="https://github.com/user-attachments/assets/f3cbd6bc-258e-4c44-8963-20a24477de10" />

2. Yang dimaksud "i > nilaiAkhir.length" ialah Menyesuaikan jumlah iterasi dengan panjang array yang sebenarnya. Jika ukuran array berubah, loop tetap bekerja dengan benar.<br>
3. Berikut ialah hasil modifikasi program: <br>
<img width="673" height="908" alt="Screenshot 2025-11-08 213048" src="https://github.com/user-attachments/assets/8476787f-62aa-42ed-bc59-72203fc48222" />