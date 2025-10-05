import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Harga Motor : ");
        double hargaMotor = sc.nextDouble();
        System.out.println("Uang Muka : ");
        double uangMuka = sc.nextDouble();
        System.out.println("Lama Cicilan (bulan) : ");
        int lamaCicilan = sc.nextInt();

        double sisaCicilan = hargaMotor - uangMuka;
        double bunga = 0.01 * sisaCicilan;
        double totalCicilan = sisaCicilan + (bunga * lamaCicilan);
        int cicilan = (int) (totalCicilan / lamaCicilan);

        System.out.println("Cicilan per bulan: Rp." + cicilan);

        sc.close();
    }
}