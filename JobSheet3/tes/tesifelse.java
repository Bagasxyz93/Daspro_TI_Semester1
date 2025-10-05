package tes;
import java.util.Scanner;

public class tesifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan;
        System.out.print("Masukkan sebuah bilangan : ");
        bilangan = sc.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan " + bilangan + " Adalah bilangan Negatif");
        }
        else if (bilangan > 0) {
            System.out.println("Bilangan " + bilangan + " Adalah bilangan Positif");
        }
        else{
            System.out.println("Bilangan " + bilangan + " Adalah Nol");
        }

        sc.close();
    }
}
