import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Apakah ingin membeli tiket? (ya/tidak): ");
            String jawab = sc.nextLine().toLowerCase();

            if (jawab.equals("tidak")) {
                System.out.println("\nTerima kasih telah berkunjung!");
                break;
            } 
            else if (jawab.equals("ya")) {

                
                while (true) {
                    System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                    jumlahTiket = sc.nextInt();
                    sc.nextLine();  

                    if (jumlahTiket < 0) {
                        System.out.println("Jumlah tiket tidak boleh negatif! Ulangi.");
                        continue; 
                    }
                    break;
                }

                double diskon = 0;

                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = 0.10;
                }

                
                double totalHarga = jumlahTiket * hargaTiket;
                double totalBayar = totalHarga - (totalHarga * diskon);

                totalTiketTerjual += jumlahTiket;
                totalPenjualan += totalBayar;

                System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
                System.out.println("Diskon: " + (diskon * 100) + "%");
                System.out.println("Total bayar: Rp " + totalBayar + "\n");
            }

        } while (true);

        // Tampilkan hasil akhir
        System.out.println("--------------------------------------");
        System.out.println("Total tiket terjual hari ini : " + totalTiketTerjual);
        System.out.println("Total penjualan tiket        : Rp " + totalPenjualan);
        System.out.println("--------------------------------------");
    }
}
