 import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        int panjang;
        int lebar;
        int luas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nilai Panjang : ");
        panjang = sc.nextInt();

        System.out.println("Masukka Nilai Lebar : ");
        lebar = sc.nextInt();

        luas = panjang*lebar;

        System.out.println("Luas persegi adalah : " + luas);

        sc.close();
    }
}
