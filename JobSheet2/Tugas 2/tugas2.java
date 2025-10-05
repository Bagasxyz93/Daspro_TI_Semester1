public class tugas2 {
    public static void main(String[] args) {

        int panjangTanah = 100, lebarTanah = 50;
        double luasTanah = panjangTanah * lebarTanah;

        double luasKolamLingkaran = 2 * (3.14 * Math.pow(1, 2));
        double luasKolamPersegi = Math.pow(2, 2);
        double luasKolam = luasKolamLingkaran + luasKolamPersegi;

        double luasRumput = luasTanah - luasKolam;
        
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Luas Tanah           : " + luasTanah + " m2");
        System.out.println("Total Luas Kolam     : " + luasKolam + " m2");
        System.out.println("===================================");
        System.out.println("Luas Tanah untuk Rumput : " + luasRumput + " m2");
    }
}
