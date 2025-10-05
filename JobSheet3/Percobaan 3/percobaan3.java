import java.util.Scanner;

public class percobaan3 {
    public static void main(String[] args) {
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Harga Barang : ");
        harga = sc.nextInt();

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Jumlah yang harus dibayar : " + jml_bayar);
        sc.close();
    }    
}
