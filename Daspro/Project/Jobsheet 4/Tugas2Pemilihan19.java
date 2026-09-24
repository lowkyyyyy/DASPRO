import java.util.Scanner;

public class Tugas2Pemilihan19 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan Jumlah SKS");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS Valid");
        }
        sc.close();
    }
}
