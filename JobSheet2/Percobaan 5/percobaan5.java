import java.util.Scanner;

public class percobaan5 {
    public static void main(String[] args) {
        int jml_tabungan_awal,lama_menabung;
        double jml_tabungan_akhir,bunga,prosentase_bunga = 0.02;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Tabungan Awal : ");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan Lama Menabung : ");
        lama_menabung = input.nextInt();
        bunga = jml_tabungan_awal * prosentase_bunga * lama_menabung;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga yang Diperoleh : " + bunga);
        System.out.println("Jumlah Tabungan Akhir : " + jml_tabungan_akhir);
        input.close();
    }
}
