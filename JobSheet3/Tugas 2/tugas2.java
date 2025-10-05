import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarak;
        double liter;
        double biaya;

        System.out.println("Masukkan jarak tempuh (km): ");
        jarak = sc.nextDouble();

        liter = jarak / 2;
        biaya = liter * 10000;

        System.out.println("Biaya perjalanan: Rp." + biaya);

        sc.close();
    }
}
