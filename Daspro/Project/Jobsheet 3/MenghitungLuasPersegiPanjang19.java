import java.util.Scanner;

public class MenghitungLuasPersegiPanjang19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);

        input.close();
    }

}