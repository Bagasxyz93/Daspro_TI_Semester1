import java.util.Scanner;

public class KafeKetiga19 {
    public static void menu(String namaPemesan, boolean isMember){
        System.out.println("Halo " + namaPemesan + ", selamat datang di Kafe Kami!");

        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");

        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - 15.000");
        System.out.println("2. Cappuccino - 20.000");
        System.out.println("3. Latte - 25.000");
        System.out.println("4. Espresso - 18.000");
        System.out.println("5. Teh Tarik - 12.000");
        System.out.println("6. Roti Bakar - 10.000");
        System.out.println("7. Mie Goreng - 15.000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");

    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem){
        int[] hargaItem = {15000, 20000, 25000, 18000, 12000, 10000, 15000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;   
    }

    public static void main(String[] args) {
        menu("Bagas", true);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Masukkan nomor menu yang ingin anda pesan :");
            int pilihanMenu = sc.nextInt();
            
            System.out.println("Masukkan banyak item yang ingin anda pesan :");
            int banyakItem = sc.nextInt();
            
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            System.out.println("Total harga yang harus dibayar: " + totalHarga);
        }
    }
}
