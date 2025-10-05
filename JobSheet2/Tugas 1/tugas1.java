import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        int gajiPokok ;
        int tunjangan_anak ;
        int jumlah_anak ;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = input.nextInt();

        System.out.print("Masukkan Tunjangan Anak: ");
        tunjangan_anak = input.nextInt();

        System.out.print("Masukkan Jumlah Anak: ");
        jumlah_anak = input.nextInt();
        
        input.close();
        double totalTunjanganAnak = tunjangan_anak * jumlah_anak;
        double potonganPensiun = gajiPokok * 0.05;
        double gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Anak: " + totalTunjanganAnak);
        System.out.println("Potongan Pensiun: " + potonganPensiun);
        System.out.println("================================");
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
