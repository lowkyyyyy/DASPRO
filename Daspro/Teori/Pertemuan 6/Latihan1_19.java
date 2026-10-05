import java.util.Scanner;
public class Latihan1_19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int bil1, bil2, bil3, terbesar;

        System.out.println("Bilangan 1");
        bil1 = sc.nextInt();

        System.out.println("Bilangan 2");
        bil2 = sc.nextInt();

        System.out.println("Bilangan 3");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {

        } if (bil1 > bil3) {
            terbesar = bil1;
        } else {
            terbesar = bil3;

        } if (bil2 > bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }

        System.out.println("Bilangan Terbesar Adalah" + terbesar);
        sc.close();
    }
}