package JobSheet9.Percobaan4-JbS9;
import java.util.Scanner;
public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlNilai=0;

        // input jumlah nilai
        System.out.print("Masukkan banyaknya nilai yaang akan diinput: ");
            jmlNilai = sc.nextInt();
            int [] arrNilai = new int [jmlNilai];
        
        // input nilai mahasiswa
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("nilai ke-" + (i+1) + ":");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1; // inisialisasi dengan -1 untuk menandakan nilai belum ditemukan
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break; 
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan, merupakan nilai mahasiswa ke-" +jmlNilai);
        } else{
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        System.out.println();
    }
}
