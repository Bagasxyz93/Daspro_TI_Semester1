
package JobSheet8.Percobaan3JbS8;

import java.util.Scanner;

public class triangle19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt();
    int i = 0;
    sc.close();
    while (i <= n) {
        int j = 0;
        while (j < i) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
   }
}
