import java.util.Scanner;

public class nestedAksesLab19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah punya izin dosen? (true/false): ");
        boolean punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah asisten lab? (true/false): ");
        boolean asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorium Dberikan");
            } else {
                System.out.println("Akses Ditolak, Harus Meminta Izin Dosen Atau Status Asisten Lab Terlebih Dahulu");
            }
        } else {
            System.out.println("Akses Ditolak. Status Mahasiswa Tidak Memenuhi Syarat");
        }

        sc.close(); 
    }
}