import java.io.IOException;
import java.util.Scanner;

public class CRUDArray {
    static Scanner input = new Scanner(System.in);
    static String[] data = new String[100]; // tempat menyimpan data
    static int jumlahData = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            clearScreen();
            System.out.println("=== PROGRAM CRUD SEDERHANA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = getInt();

            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> tampilData();
                case 3 -> ubahData();
                case 4 -> hapusData();
                case 5 -> System.out.println("Terima kasih sudah menggunakan program ini!");
                default -> {
                    System.out.println("Pilihan tidak valid!");
                    pause();
                }
            }
        } while (pilihan != 5);
    }

    // ==================== FUNCTION CRUD ====================

    static void tambahData() {
        clearScreen();
        if (jumlahData < data.length) {
            System.out.print("Masukkan nama: ");
            data[jumlahData] = input.nextLine();
            jumlahData++;
            System.out.println("\n Data berhasil ditambahkan!");
        } else {
            System.out.println("\n Data sudah penuh!");
        }
        pause();
    }

    static void tampilData() {
        clearScreen();
        if (jumlahData == 0) {
            System.out.println(" Belum ada data!");
        } else {
            System.out.println("=== DAFTAR DATA ===");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
        pause();
    }

    static void ubahData() {
        clearScreen();
        if (jumlahData == 0) {
            System.out.println("⚠️ Belum ada data untuk diubah!");
        } else {
            tampilData();
            System.out.print("\nPilih nomor data yang ingin diubah: ");
            int index = getInt() -
             1;

            if (index >= 0 && index < jumlahData) {
                System.out.print("Masukkan nama baru: ");
                data[index] = input.nextLine();
                System.out.println("\n✅ Data berhasil diubah!");
            } else {
                System.out.println("⚠️ Nomor tidak valid!");
            }
        }
        pause();
    }

    static void hapusData() {
        clearScreen();
        if (jumlahData == 0) {
            System.out.println("⚠️ Belum ada data untuk dihapus!");
        } else {
            tampilData();
            System.out.print("\nPilih nomor data yang ingin dihapus: ");
            int index = getInt() - 1;

            if (index >= 0 && index < jumlahData) {
                for (int i = index; i < jumlahData - 1; i++) {
                    data[i] = data[i + 1];
                }
                jumlahData--;
                System.out.println("\n✅ Data berhasil dihapus!");
            } else {
                System.out.println("⚠️ Nomor tidak valid!");
            }
        }
        pause();
    }

    // ==================== UTILITIES ====================

    // Fungsi untuk membersihkan layar (mirip system("cls"))
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }

    // Fungsi untuk pause agar user bisa membaca hasil dulu sebelum lanjut
    public static void pause() {
        System.out.println("\nTekan ENTER untuk melanjutkan...");
        input.nextLine();
    }

    // Fungsi aman untuk input angka (menghindari crash saat user salah input)
    public static int getInt() {
        while (true) {
            try {
                int nilai = Integer.parseInt(input.nextLine());
                return nilai;
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid, masukkan angka: ");
            }
        }
    }
}
