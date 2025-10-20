package UTS;
import java.util.Scanner;

public class PenilaianAkademik {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT DATA MAHASISWA
        System.out.println("====== INPUT DATA MAHASISWA ======");
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM  : ");
        String nim = scanner.nextLine();
        System.out.println();

        // MATA KULIAH 1: Algoritma dan Pemrograman
        String namaMK1 = "Algoritma Pemrograman";
        System.out.println("--- Mata Kuliah 1: " + namaMK1 + " ---");
        System.out.print("Nilai UTS  : ");
        double uts1 = scanner.nextDouble();
        System.out.print("Nilai UAS  : ");
        double uas1 = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas1 = scanner.nextDouble();
        System.out.print("Nilai Kehadiran : ");
        double Kehadiran = scanner.nextDouble();
        System.out.print("Nilai Etika : ");
        double Etika = scanner.nextDouble();
        System.out.println();
        
        // MATA KULIAH 2: Struktur Data 
        String namaMK2 = "Struktur Data";
        System.out.println("--- Mata Kuliah 2: " + namaMK2 + " ---");
        System.out.print("Nilai UTS  : ");
        double uts2 = scanner.nextDouble();
        System.out.print("Nilai UAS  : ");
        double uas2 = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas2 = scanner.nextDouble();
        System.out.print("Nilai Kehadiran : ");
        double Kehadiran2 = scanner.nextDouble();
        System.out.print("Nilai Etika : ");
        double Etika2 = scanner.nextDouble();
        System.out.println();
        scanner.nextLine();

        // PROSES PERHITUNGAN NILAI AKHIR
        
        double nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        double nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);

        // PENENTUAN NILAI HURUF DAN STATUS MK1 
        String nilaiHuruf1 = "";
        String statusMK1 = "";
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            nilaiHuruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            nilaiHuruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            nilaiHuruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            nilaiHuruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            nilaiHuruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            nilaiHuruf1 = "D";
        } else {
            nilaiHuruf1 = "E";
        }
        statusMK1 = (nilaiAkhir1 >= 60 && Kehadiran >= 75 && Etika >= 70) ? "LULUS" : "TIDAK LULUS";

        // PENENTUAN NILAI HURUF DAN STATUS MK2
        String nilaiHuruf2 = "";
        String statusMK2 = "";
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            nilaiHuruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            nilaiHuruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            nilaiHuruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            nilaiHuruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            nilaiHuruf2 = "D";
        } else {
            nilaiHuruf2 = "E";
        }
        statusMK2 = (nilaiAkhir2 >= 60 && Kehadiran2 >= 75 && Etika2 >= 70) ? "LULUS" : "TIDAK LULUS";

        // PERHITUNGAN RATA-RATA AKHIR SEMESTER 
        double totalNilaiAkhir = nilaiAkhir1 + nilaiAkhir2;
        int jumlahMK = 2;
        double rataRataAkhir = totalNilaiAkhir / jumlahMK;

        // PENENTUAN STATUS SEMESTER
        String statusSemester;
        if (statusMK1.equals("LULUS") && nilaiAkhir1 >= 60) {
            if(statusMK2.equals("LULUS") && nilaiAkhir2 >= 60) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Mata Kuliah 2 Tidak Lulus)";

            }
        } else {
            statusSemester = "TIDAK LULUS (Mata Kuliah 1 Tidak Lulus)";
        }

        // HASIL PENILAIAN AKADEMIK
        System.out.println("====== HASIL PENILAIAN AKADEMIK ======");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();

        // Header Tabel
        System.out.printf("%-25s %-5s %-5s %-6s %-18s %-14s %-12s %-12s %-10s%n", 
            "Mata Kuliah", "UTS", "UAS", "Tugas","Nilai Kehadiran","Nilai Etika", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("----------------------------------------------------------------------------------");

        // Isi Tabel MK 1
        System.out.printf("%-25s %-5.0f %-5.0f %-6.0f %-18.2f %-14.2f %-12.2f %-12s %-10s%n", 
            namaMK1, uts1, uas1, tugas1, Kehadiran, Etika, nilaiAkhir1, nilaiHuruf1, statusMK1);
            
        // Isi Tabel MK 2
        System.out.printf("%-25s %-5.0f %-5.0f %-6.0f %-18.2f %-14.2f %-12.2f %-12s %-10s%n", 
            namaMK2, uts2, uas2, tugas2, Kehadiran2, Etika2, nilaiAkhir2, nilaiHuruf2, statusMK2);

        System.out.println();
        
        // Rata-rata dan Status Semester
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", rataRataAkhir);
        System.out.println("Status Semester      : " + statusSemester);
        scanner.close();
    }
}