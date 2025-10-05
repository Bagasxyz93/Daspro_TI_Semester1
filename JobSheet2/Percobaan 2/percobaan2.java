public class percobaan2 {

    public static void main(String[] args) {
        char golonganDarah = 'O';
        byte jarak = (byte) 130 ;
        short jumlahPendudukDesa = 1025;
        float suhu = 60.50F;
        double berat = 0.5367812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan Darah: " + (byte)golonganDarah);
        System.out.println("Jarak:" + jarak);
        System.out.println("Jumlah Penduduk Desa: " + jumlahPendudukDesa);
        System.out.println("Suhu: " + suhu);
        System.out.println("Berat: " + (float)berat);
        System.out.println("Saldo: " + saldo);
        System.out.println("Angka Desimal: " + angkaDesimal);
    }
}