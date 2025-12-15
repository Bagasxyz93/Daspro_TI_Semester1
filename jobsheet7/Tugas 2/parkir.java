import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis;
        int durasi;
        int biaya;
        int total = 0;

        System.out.println("===== Program Hitung Biaya Parkir =====");

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Anda memilih keluar. Terima kasih!");
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid.");
                continue;
            }

            if (durasi > 5) {
                biaya = 12500;
                System.out.println("Durasi parkir lebih dari 5 jam, tarif flat Rp. 12.500.");
            } else {
                if (jenis == 1) {
                    biaya = durasi * 3000;
                    System.out.println("Jenis kendaraan: Mobil (tarif Rp. 3000/jam)");
                } else {
                    biaya = durasi * 2000;
                    System.out.println("Jenis kendaraan: Motor (tarif Rp. 2000/jam)");
                }
            }

            total += biaya;
            System.out.println("Biaya parkir: Rp. " + biaya);
            System.out.println("--------------------------");
        }

        System.out.println("Total pendapatan hari ini ialah: Rp. " + total);
    }
}
