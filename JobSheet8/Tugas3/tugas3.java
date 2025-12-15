package JobSheet8.tugas3;

import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variabel untuk total keseluruhan
        int totalPelangganSemuaCabang = 0;
        int totalItemTerjualSemuaCabang = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt(); // Input jumlah cabang [cite: 254]

        System.out.println("== Input Penjualan Per Cabang ==");

        // Outer Loop: Iterasi untuk setiap Cabang
        for (int i = 1; i <= jumlahCabang; i++) { // i: nomor cabang
            System.out.println("\nCabang " + i);

            // Variabel lokal per cabang, direset di setiap iterasi cabang
            int totalItemCabang = 0;

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt(); // Input jumlah pelanggan per cabang [cite: 254]
            
            // Inner Loop: Iterasi untuk setiap Pelanggan di cabang saat ini
            for (int j = 1; j <= jumlahPelanggan; j++) { // j: nomor pelanggan
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int itemDipesan = sc.nextInt(); // Input jumlah item per pelanggan [cite: 255]
                totalItemCabang += itemDipesan; // Akumulasi total item terjual di cabang
            }
            
            // Akumulasi total keseluruhan
            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemTerjualSemuaCabang += totalItemCabang;

            // Tampilkan ringkasan penjualan per cabang [cite: 263, 264]
            System.out.println("\nCabang " + i + ":");
            System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("Item terjual: " + totalItemCabang + " item");
        }

        // Tampilkan total keseluruhan dari seluruh cabang [cite: 272]
        System.out.println("\n== Total seluruh Cabang ==");
        System.out.println("Pelanggan: " + totalPelangganSemuaCabang + " orang");
        System.out.println("Item terjual: " + totalItemTerjualSemuaCabang + " item");

        sc.close();
    }
}
