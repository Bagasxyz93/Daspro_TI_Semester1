import java.util.Scanner;   

public class percobaan4 {
    public static void main(String[] args) {
        int gajiPokok;
        int hasilAkhir;
        double totalGaji,bonus;
        double tunjanganTransportasi = 600000;
        double tunjanganMakan = 400000;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Gaji Pokok : ");
        gajiPokok = sc.nextInt();

        bonus = 0.05*gajiPokok;
        totalGaji = gajiPokok + tunjanganTransportasi + tunjanganMakan + bonus - (0.1 * gajiPokok);

        hasilAkhir = (int) Math.round(totalGaji);

        System.out.println("Bonus bulanan : " + bonus);
        System.out.println("Total Gaji : " + totalGaji);
        System.out.println("Hasil Akhir : " + hasilAkhir);
        sc.close();
    }
}
