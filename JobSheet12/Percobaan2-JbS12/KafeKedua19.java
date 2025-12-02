public class KafeKedua19 {

    public static void menu(String namaPemesan, boolean isMember){
        System.out.println("Halo " + namaPemesan + ", selamat datang di Kafe Kami!");

        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");

        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - 15.000");
        System.out.println("2. Cappuccino - 20.000");
        System.out.println("3. Latte - 25.000");
        System.out.println("4. Espresso - 18.000");
        System.out.println("5. Teh Tarik - 12.000");
        System.out.println("6. Roti Bakar - 10.000");
        System.out.println("7. Mie Goreng - 15.000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");

    }

    public static void main(String[] args) {
        menu("Bagas",true);
    }
}
