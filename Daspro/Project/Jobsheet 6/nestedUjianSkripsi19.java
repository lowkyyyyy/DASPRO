import java.util.Scanner;

public class nestedUjianSkripsi19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Apakah Mahasiswa Sudah Bebas Kompen? (Ya/Tidak) :");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan Jumlah Log Bimbingan Pembimbing 1 :");
        int bimbinganP1 = sc.nextInt();

        System.out.println("Masukkan Jumlah Log Bimbingan Pembimbing 2 :");
        int bimbinganP2 = sc.nextInt();
        
        String pesan = "";

       
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua Syarat Terpenuhi. Mahasiswa Boleh Mendaftar Ujian Skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log Bimbingan P1 Belum Mencapai 8 Kali dan bimbingan P2 Belum Mencapai 4 Kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log Bimbingan P1 Belum Mencapai 8 kali";
            } else {
                pesan = "Gagal! Log Bimbingan P2 Belum Mencapai 4 Kali";
            } 
            
        } else {
            pesan = "Gagal! Mahasiswa Masih Memiliki Tanggungan Kompen";
        }
        
        System.out.println(pesan);
        
        sc.close();
    }
}