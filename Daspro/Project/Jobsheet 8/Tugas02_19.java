import java.util.Scanner;

public class Tugas02_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.print("Masukkan Nilai N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
                total += i * j;
            }
            System.out.println();
            total += i;
            }

            System.out.println("Jumlah Seluruh Angka : " + total);
            System.out.println("");

            sc.close();
    }
}
