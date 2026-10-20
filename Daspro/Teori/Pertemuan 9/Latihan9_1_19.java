import java.util.Scanner;

public class Latihan9_1_19{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int jam;
        int hari = 1;
        int total = 0;

        do {
            System.out.print("Masukkan jam belajar hari ke-" + hari + " : ");
            jam = sc.nextInt();
            if (jam < 10) {
                
            } else {
                System.out.println("Jam belajar tidak masuk akal");
            }
            total += jam;
            hari ++;

        } while (hari <= 7);
        System.out.println("Total jam belajar dalam seminggu : " + total);
        sc.close();
    }
}