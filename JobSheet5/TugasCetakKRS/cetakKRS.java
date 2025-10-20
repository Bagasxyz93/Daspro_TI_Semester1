package TugasCetakKRS;
import java.util.Scanner;

public class cetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Cetak KRS Siakad ----");
        System.out.print("Apakah UKT Sudah Lunas (true/false) : ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) 
        {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta Tanda Tangan DPA");
        }
        else 
        {
            System.out.println("Pembayaran UKT Belum Terverifikasi");
            System.out.println("Silahkan Lakukan Pembayaran UKT Terlebih Dahulu");
        }
        sc.close();
    }
}
