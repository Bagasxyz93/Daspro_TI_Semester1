/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JobSheet8.tugas1;

import java.util.Scanner;

public class tugas1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlah= 0;
            System.out.print("Jumlah kuadrat 1 s.d " + i + ": ");
            for (int j = 1; j <= i; j++) {
                jumlah += j*j;
                System.out.print(j + "^2");
                if (j < i) {
                    System.out.print("+");
                }
            }
            System.out.println(" = " +jumlah);
        }
    }
}
