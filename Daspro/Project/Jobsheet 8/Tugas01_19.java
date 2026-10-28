import java.util.Scanner;

public class Tugas01_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.print("Masukkan Nilai N : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            total += i;
            }

            System.out.println("Total Angka Yang Tercetak : " + total);
            System.out.println("");

            sc.close();
        }
    }
