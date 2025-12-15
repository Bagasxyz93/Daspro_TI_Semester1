# JobSheet 8 - Percobaan 1

## Pertanyaan 

 1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya?
Mengapa bisa demikian?
 2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk
outputnya jika input n = 5? Mengapa hasilnya berbeda?
 3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya?
Mengapa bisa demikian?
 4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya?
Mengapa bisa demikian?
 5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola
outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?

## Jawaban

1. Akibat dari perubahan inisialisasi **i=1 (mulai dari langkah ke-1) menjadi i=0 (mulai dari langkah ke-0)** yaitu Hitungan akan dimulai dari angka nol. Ini berarti total langkah yang diambil bertambah satu (misalnya, dari 1 sampai 5 ada 5 langkah; dari 0 sampai 4 juga 5 langkah, tetapi nilainya berbeda). Karena, Dalam pemrograman, banyak hal (seperti daftar atau array) dimulai dari nol (indeks 0). Mengubahnya menjadi i=0 membuat perulangan selaras dengan cara komputer menghitung, yaitu dari nol. <br>
> <img width="775" height="658" alt="Screenshot 2025-10-30 213503" src="https://github.com/user-attachments/assets/30f03e96-f78d-4567-8a9d-82b15b2a81af" />

2. Akibat dari perubahan inisialisasi **i<=n (Berhenti setelah mencapai n) menjadi i < n (berhenti sebelum mencapai n)** yaitu Perulangan akan berhenti satu langkah lebih awal. Nilai n itu sendiri tidak ikut diproses yang membedakan ialah adanya tanda "=". <br>
> <img width="825" height="656" alt="Screenshot 2025-10-30 213746" src="https://github.com/user-attachments/assets/a31a37e3-5889-4f00-a675-9abf33f16433" />

3. Akibat dari kondisi **i < n menjadi i > n** yaitu Perulangan tidak akan berjalan sama sekali (nol iterasi), kecuali jika nilai awal i(inisialisasi) sudah lebih besar dari n. Karena, Asumsikan perulangan dimulai dengan i yang lebih kecil dari n, misalnya i=1 dan n=5.Kondisi Awal (Mengecek i > n): Ketika i=1, kondisi 1 > 5 adalah SALAH. Aturan Perulangan ialah Perulangan for akan langsung berhenti atau tidak akan pernah dimulai jika kondisi di awal sudah salah. <br>
> <img width="817" height="806" alt="Screenshot 2025-10-30 213556" src="https://github.com/user-attachments/assets/e0a0c555-120f-44c6-bf01-4032da4b9605" />
4. Akibat dari perubahan kondisi **i++ (Lompatan bertambah 1) menjadi i--(Lommpatan berkurang 1)** yaitu Perulangan akan TIDAK PERNAH BERHENTI (Infinite Loop) jika kondisi awal dan mulai (misalnya i=1, kondisi i <= n dengan n positif) tidak diubah. Karena engan i--, kita bergerak MENJAUHI batas berhenti (menjadi 0, -1, -2, dst.). Karena nilai akan terus mengecil dan tidak akan pernah melewati batas atas n, kondisi untuk berhenti tidak akan pernah terpenuhi. <br>
> <img width="864" height="903" alt="Screenshot 2025-10-28 110749" src="https://github.com/user-attachments/assets/8c747b91-8847-41ec-8e7f-80bb6fadb85d" />

5. Akibat dari perubahan kondisi **i++ (Lompatan bertambah 1) menjadi i+=2 (Lompatan bertambah 2)** yaitu Ketika langkah (step) diubah dari i++ menjadi i += 2, kita mengubah aturan pergerakan perulangan. Instruksi i += 2 berarti "tambahkan 2 pada nilai i setelah setiap putaran."Jika kita menjalankan perulangan ini dengan batas akhir n=6 (dengan asumsi inisialisasi awal adalah i=1), maka pola output yang dihasilkan adalah 1, 3, 5. <br>
> <img width="906" height="703" alt="Screenshot 2025-10-28 110728" src="https://github.com/user-attachments/assets/cdedeb64-c54f-4384-a08c-c4eaa9095022" />