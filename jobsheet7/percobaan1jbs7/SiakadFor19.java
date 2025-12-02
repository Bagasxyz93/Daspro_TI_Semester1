package jobsheet7.percobaan1jbs7;
import java.util.Scanner;

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for(int a = 1; a <= 10; a++){
            System.out.print("Masukkan nilai mahasiswa ke-" + a + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
        }
        sc.close();
        System.out.println("Nilai tertinggi adalah: " + tertinggi);
        System.out.println("Nilai terendah adalah: " + terendah);
    }
}
