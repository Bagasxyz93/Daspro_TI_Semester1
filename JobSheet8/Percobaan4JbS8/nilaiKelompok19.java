package JobSheet8.Percobaan4JbS8;

import java.util.Scanner;

public class nilaiKelompok19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalNilai=0,rataNilai, rataTertinggi=0;
        int nilai, kelompokTertinggi= 0;

        int i=1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai=0;
        
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai; 
            
        }
        rataNilai = totalNilai   / 5;
        System.out.println("Rata-rata nilai kelompok: " +  rataNilai);

        if (rataNilai > rataTertinggi) {
            rataTertinggi = rataNilai;
            kelompokTertinggi = i;
        }
        i++;
    }
    System.out.println("\nKelompok dengan rata-rata TErtinggi adalah " + kelompokTertinggi+ " dengan rata-rata sebesar " +rataTertinggi);
    sc.close();
    }
}
