# JobSheet 8 - Percobaan 2

## Pertanyaan 

 1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah
menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
 2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan
perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang
akibatnya? Mengapa bisa demikian?
 3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada
di dalamnya?
 4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah
perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
 5. Silakan commit dan push ke repository Anda.

## Jawaban

1. Jika pada perulangan luar (yang biasanya mengurus baris), inisialisasi diubah dari **iOuter=1 menjadi iOuter=0**, akibatnya adalah perulangan tersebut akan memulai hitungan dari nol. Karena,  Perubahan ini menyebabkan iterasi (putaran) pertama yang dieksekusi adalah untuk nilai iOuter=0, bukan iOuter=1 (misalnya, dari 1 sampai 5 ada 5 putaran; dari 0 sampai 5 ada 6 putaran). Dalam konteks pencetakan pola, ini berarti akan ada satu baris tambahan yang dihasilkan, yaitu baris ke-0. <br>
> <img width="926" height="815" alt="Screenshot 2025-10-28 112036" src="https://github.com/user-attachments/assets/a1aa49e1-9565-408d-884f-88f2a097100a" />

2. Jika inisialisasi diubah dari **i=1 menjadi i=0**, akibatnya adalah perulangan dalam akan selalu memulai dari nol untuk setiap putaran perulangan luar. perubahan ini menyebabkan perulangan dalam memiliki satu putaran tambahan (mulai dari i=0). <br>
> <img width="949" height="965" alt="Screenshot 2025-10-28 112131" src="https://github.com/user-attachments/assets/40365d4a-3aec-4639-a01b-249a29bd89a2" />

3. **Perbedaan Perulangan luar & dalam**: <br>
- Perulangan Luar (Outer Loop) - Pengatur Baris: Tugas utamanya adalah mengatur berapa kali seluruh proses (termasuk perulangan dalam) harus diulang, yang secara visual berarti mengatur jumlah baris yang akan dihasilkan. Setiap satu putaran perulangan luar selesai, kita pindah ke baris baru.<br>
- Perulangan Dalam (Inner Loop) - Pengatur Kolom: Tugas utamanya adalah menentukan apa yang terjadi di dalam satu baris. Ia mengatur jumlah karakter atau elemen yang dicetak secara horizontal sebelum berganti baris. Perulangan dalam akan selesai seluruhnya baru kemudian perulangan luar melanjutkan putaran berikutnya. <br>
4. Fungsi sintaks "System.out.println();" di perulangan dalam yaitu perintah untuk pindah baris. Perintah ini memberitahu program untuk mengakhiri baris yang sedang dicetak oleh perulangan dalam dan memindahkan kursor pencetakan ke awal baris baru (melakukan line break). Jika Sintaks "System.out.println();" dihilangkan maka semua hasil percetakan akan menyatu dalam satu baris panjang. <br>