package tes;
import java.util.Scanner;

public class tesifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        int jumlahPrestasi;

        System.out.println("Masukkan rata rata Nilai : ");
        nilai = sc.nextInt();

        System.out.println("Masukkan Jumlah Prestasi : ");
        jumlahPrestasi = sc.nextInt();

        if(nilai > 95 && jumlahPrestasi > 20){
            System.out.println("Kamu adalah Mahasiswa terbaik YEAYYYYY!!!!!");
        }
        else{
            System.out.println("NICE TRYY  NTNTNTNTNTNT");
        }

        sc.close();
    }
}
