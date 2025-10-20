package Percobaan3Jb5;
import java.util.Scanner;

public class percobaan3 {
    public static void main(String[] args) {
        String pesan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Mahasiswa Bebas Kompen (Ya / Tidak) : ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1 : ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2 : ");
        int bimbinganP2 = sc.nextInt();

        sc.close();

        if (bebasKompen.equalsIgnoreCase("Ya")) 
        {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) 
            {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian Skripsi";    
            }
            else if (bimbinganP1 < 8 && bimbinganP2 < 4)
            {
                pesan = "Gagal! Karena Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }
            else if (bimbinganP1 < 8)
            {
                pesan = "Gagal! Karena Log bimbingan P1 belum mencapai 8 kali";
            }
            else
            {
                pesan = "Gagal! Karena Log bimbingan P2 belum mencapai 4 kali"; 
            }
        }else{
            pesan = "Gagal! Karena Mahasiswa Masih memiliki tanggungan Kompen";
        }
        System.out.println(pesan);
    }
}
