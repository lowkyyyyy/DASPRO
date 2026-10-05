import java.util.Scanner;

public class operatorLogikaWifi19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.println("Apakah Pengguna adalah Mahasiswa? (true/false)");
        mahasiswa = sc.nextBoolean();

        System.out.println("Apakah Pengguna adalah Dosen? (true/false)");
        dosen = sc.nextBoolean();

        System.out.println("Apakah Akun Diblokir? (true/false)");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi Diberikan");
        } else {
            System.out.println("Akses Wifi Ditolak");
        }

        sc.close();
    }
}