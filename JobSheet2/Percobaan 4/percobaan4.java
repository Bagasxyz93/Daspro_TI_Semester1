import java.util.Scanner;

public class percobaan4 {
    public static void main(String[] args) {
        int alas, tinggi;
        float luas;

        Scanner input = new Scanner(System.in); 

        System.out.println("Masukkan Alas : ");
        alas = input.nextInt();
        System.out.println("Masukkan Tinggi : ");
        tinggi = input.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga : " + luas);
        
        input.close();
    }
}
