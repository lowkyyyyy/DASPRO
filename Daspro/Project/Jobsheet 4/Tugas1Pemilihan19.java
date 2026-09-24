import java.util.Scanner;

public class Tugas1Pemilihan19 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lunas? (true / false): ");
        boolean uktLunas = sc.nextBoolean();

       // Ternary Operator
           String pesan = uktLunas
               ? "Pembayaran UKT terverifikasi\ncetak KRS dan minta Tanda Tangan DPA"
               : "Registrasi Ditolak\nsilahkan lunasi UKT terlebih dahulu";

           System.out.println(pesan);
        
        sc.close();
    }
}