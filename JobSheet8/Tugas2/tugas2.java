package JobSheet8.tugas2;

import java.util.Scanner;

public class tugas2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 3): ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Nilai n harus minimal 3. Coba lagi.");
            }
        } while (n < 3);

        System.out.println("\nPola Persegi Angka Berongga (n=" + n + "):");
        String angka = String.valueOf(n);

        // Perulangan Luar (i): Mengontrol Baris
        for (int i = 1; i <= n; i++) {
            
            // Perulangan Dalam (j): Mengontrol Kolom
            for (int j = 1; j <= n; j++) {
                
                // Kondisi untuk mencetak angka n (Batas Persegi):
                // 1. Baris pertama (i == 1)
                // 2. Baris terakhir (i == n)
                // 3. Kolom pertama (j == 1)
                // 4. Kolom terakhir (j == n)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(angka + " "); // Cetak angka dan spasi
                } else {
                    // Cetak dua spasi di bagian dalam (rongga) untuk menjaga keselarasan
                    System.out.print("  "); 
                }
            }
            System.out.println(); // Pindah ke baris baru
        }
    }
}
