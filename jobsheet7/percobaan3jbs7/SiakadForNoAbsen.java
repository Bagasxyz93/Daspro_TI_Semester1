package jobsheet7.percobaan3jbs7;
import java.util.Scanner;

public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (Ketik batal untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi yang dipesan: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh yang dipesan: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti yang dipesan: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + " adalah: Rp " + totalHarga);
            sc.nextLine(); 
        } while (true);
        
        System.out.println("Terima kasih telah menggunakan layanan kami.");
        sc.close();
    }
}
