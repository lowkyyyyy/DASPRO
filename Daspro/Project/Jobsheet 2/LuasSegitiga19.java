import java.util.Scanner;

public class LuasSegitiga19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas segitiga: ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = input.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}

