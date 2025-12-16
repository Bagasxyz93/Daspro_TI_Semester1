package JobSheet9.Percobaan3-JbS9;
import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double total = 0;
        double rata2;
        int jmlMhs=0, mhsLulus=0, totalMhsLulus=0, mhsTdkLulus=0, totalMhsTdkLulus=0;

        // input jml Mahasiswa
        System.out.print("Masukkan jumlah Mahasiswa: " );
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        // input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1)+ " :");
            nilaiMhs[i] = sc.nextInt();
        }

        // hitung total dan mahasiswa yang lulus
        System.out.println("\nMahasiswa yang lulus (nilai > 70)");
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
             if (nilaiMhs[i] > 70) {
                mhsLulus++;
                totalMhsLulus += nilaiMhs[i];
            } else {
                mhsTdkLulus++;
                totalMhsTdkLulus += nilaiMhs[i];
            }
    }
        // hitung rata-rata
        rata2 = total/jmlMhs;
        double rata2lulus = totalMhsLulus/mhsLulus;
        double rata2Tdklulus = totalMhsTdkLulus/mhsTdkLulus;
        System.out.println("Rata-rata nilai lulus  = " +rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus= " +rata2Tdklulus);
        System.out.println("Jumlah mahasiswa yang lulus sebanyak  = " +mhsLulus);
    }
}
