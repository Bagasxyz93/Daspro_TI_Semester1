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

 1.
 2.
 3. Keluaran dari program tersebut akan sama, Karena itu adalah perulangan untuk mengeluarkan semua isi index 
 4. Hasil akan tetap keluar tapi pada loop yang ke 4 maka akan keluar error 
    "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
      at ArrayBilangan19.main(ArrayBilangan19.java:11)" maksudnya adalah index 4 tidak ada atau panjang index tidak sampai 4