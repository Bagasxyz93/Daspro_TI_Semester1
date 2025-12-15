import java.util.Scanner;

public class Magang {
    private static final int MAX_PENDAFTAR = 200;
    private static final int JUMLAH_KOLOM = 6;
    private static final String[][] dataPendaftar = new String[MAX_PENDAFTAR][JUMLAH_KOLOM];
    private static int jumlahPendaftar = 0;
    private static final Scanner input = new Scanner(System.in);

    public static void tampilkanMenu(){
        //class menampilkan menu
        System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
        System.out.println("5. Keluar");
    }

    public static void tambahData(){
        //class menambah data pendaftar magang
        if (jumlahPendaftar >= MAX_PENDAFTAR) {
            System.out.println("Kapasitas pendaftar sudah penuh.");
            return;
        }

        // Input data pendaftar
        System.out.print("Nama Mahasiswa: ");
        dataPendaftar[jumlahPendaftar][0] = input.nextLine();
        System.out.print("NIM: ");
        dataPendaftar[jumlahPendaftar][1] = input.nextLine();
        System.out.print("Program Studi: ");
        dataPendaftar[jumlahPendaftar][2] = input.nextLine();
        System.out.print("Perusahaan Tujuan Magang: ");
        dataPendaftar[jumlahPendaftar][3] = input.nextLine();

        int semester = 0;

        boolean validSemester = false;
        while (!validSemester) {
            System.out.print("Semester Pengambilan Magang (6 atau 7): ");
            if (input.hasNextInt()) {
                semester = input.nextInt();
                if (semester == 6 || semester == 7) {
                    dataPendaftar[jumlahPendaftar][4] = String.valueOf(semester);
                    validSemester = true;
                } 
                else{
                    System.out.println("Error: Semester harus 6 atau 7. Silakan coba lagi.");
                }
            }
            else{
                System.out.println("Error: Input tidak valid. Silakan masukkan Semester 6 atau 7.");
            }
            input.nextLine(); 
        }
        String status = "";
        boolean validStatus = false;
        while (!validStatus) {
            System.out.print("Status Pendaftar (Diterima/Menunggu/Ditolak): ");
            status = input.nextLine();

            if(status.equalsIgnoreCase("Diterima") || status.equalsIgnoreCase("Menunggu") || status.equalsIgnoreCase("Ditolak")){
                dataPendaftar[jumlahPendaftar][5] = status;
                validStatus = true;
            }
            else{
                System.out.println("Error: Status harus Diterima, Menunggu, atau Ditolak. Silakan coba lagi.");
            }
        }

        jumlahPendaftar++;
        System.out.println("Data pendaftar magang berhasil ditambahkan. Total pendaftar: " + jumlahPendaftar);

    }

    public static void tampilkanSemua(){
        //class menampilkan semua pendaftar magang
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar magang.");
            return;
        }

        // Tampilkan header tabel
        System.out.println("=== Daftar Pendaftar Magang ===");
        System.err.println();
        System.out.println("+-----+----------------------+--------------+----------------------+----------------------+----------+------------+");
        System.out.printf("| %-3s | %-20s | %-12s | %-20s | %-20s | %-8s | %-10s |\n", 
            "No", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status");
        System.out.println("+-----+----------------------+--------------+----------------------+----------------------+----------+------------+");

        for(int i = 0; i < jumlahPendaftar; i++){
            System.out.printf("| %-3d | %-20s | %-12s | %-20s | %-20s | %-8s | %-10s |\n",
                (i + 1), 
                dataPendaftar[i][0],
                dataPendaftar[i][1],
                dataPendaftar[i][2].length() > 20 ? dataPendaftar[i][2].substring(0, 17) + "..." : dataPendaftar[i][2],
                dataPendaftar[i][3].length() > 20 ? dataPendaftar[i][3].substring(0, 17) + "..." : dataPendaftar[i][3],
                dataPendaftar[i][4],
                dataPendaftar[i][5]
            );
        }

        System.out.println("+-----+----------------------+--------------+----------------------+----------------------+----------+------------+");  
    }

    public static void cariBerdasarkanProdi(){
        //class mencari pendaftar magang berdasarkan program studi
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar magang.");
            return;
        }

        // Input program studi yang dicari
        System.out.print("Masukkan Program Studi yang dicari: ");
        String prodiCari = input.nextLine();

        int foundCount = 0;
        System.out.println("=== Hasil Pencarian Untuk Program Studi " + prodiCari + "===");
        System.out.println();

        System.out.println("+-----+----------------------+--------------+----------------------+----------------------+----------+------------+");
        System.out.printf("| %-3s | %-20s | %-12s | %-20s | %-20s | %-8s | %-10s |\n", 
            "No", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status");
        System.out.println("+-----+----------------------+--------------+----------------------+----------------------+----------+------------+");

        for (int a = 0; a < jumlahPendaftar; a++) {
            if (dataPendaftar[a][2].equalsIgnoreCase(prodiCari)) {
                foundCount++;
                System.out.printf("| %-3d | %-20s | %-12s | %-20s | %-20s | %-8s | %-10s |\n",
                    foundCount, 
                    dataPendaftar[a][0],
                    dataPendaftar[a][1],
                    dataPendaftar[a][2].length() > 20 ? dataPendaftar[a][2].substring(0, 17) + "..." : dataPendaftar[a][2],
                    dataPendaftar[a][3].length() > 20 ? dataPendaftar[a][3].substring(0, 17) + "..." : dataPendaftar[a][3],
                    dataPendaftar[a][4],
                    dataPendaftar[a][5]
                );
            }
            
        }
        System.out.println("+-----+----------------------+--------------+----------------------+----------------------+----------+------------+");

        if (foundCount == 0) {
            System.out.println("Tidak ada pendaftar dengan Program Studi " + prodiCari + ".");
        }
        else{
            System.out.println("Total pendaftar dengan Program Studi " + prodiCari + ": " + foundCount);
        }
    }

    public static void hitungStatus(){
        //class menghitung jumlah pendaftar magang berdasarkan status
        if (jumlahPendaftar == 0) {
            System.out.println("Belum ada pendaftar magang.");
            return;
        }

        int diterima = 0;
        int menunggu = 0;
        int ditolak = 0;

        // Hitung jumlah berdasarkan status
        for (int i = 0; i < jumlahPendaftar; i++) {
            String status = dataPendaftar[i][5];
            switch (status.toLowerCase()) {
                case "diterima" -> 
                diterima++;
                case "menunggu" ->
                menunggu++;
                case "ditolak" ->
                ditolak++;
            }
        }

        // Tampilkan hasil
        System.out.println("=== Jumlah Pendaftar Berdasarkan Status ===");
        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak   : " + ditolak);
        System.out.println("Total Pendaftar : " + jumlahPendaftar);
    }

    public static void main(String[] args) {
        int pilihanMenu;
        do {

            // Tampilkan menu
            tampilkanMenu();

            System.out.print("Pilih menu (1-5): ");
            // Validasi input menu
            if (input.hasNextInt()) {
                pilihanMenu = input.nextInt();
                input.nextLine();
            }
            else{
                System.out.println("Input tidak valid. Silakan masukkan angka antara 1-5.");
                input.nextLine(); 
                pilihanMenu = 0;
            }

            // Proses pilihan menu
            switch (pilihanMenu) {
                case 1 -> {
                    tambahData();
                }
                case 2 -> {
                    tampilkanSemua();
                }
                case 3 -> {
                    cariBerdasarkanProdi();
                }
                case 4 -> {
                    hitungStatus();
                }
                case 5 -> {
                    System.out.println("Terima kasih telah menggunakan sistem pendaftaran magang.");
                    System.exit(0);
                }
            
                default -> {
                    if (pilihanMenu != 0) {
                        System.out.println("Pilihan tidak valid. Silakan pilih 1 sampai 5.");
                    }
                }
            }
            System.out.println();
        } while (pilihanMenu != 5);
    }
}
