import java.util.Scanner;

public class Tugas2_19{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        
       do {
        System.out.println("Masukkan Jenis Mobil = 1, Motor = 2, Keluar = 0");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.println("Masukkan Lama Durasi Parkir (jam) : ");
            durasi = sc.nextInt();

            if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
        } 
       } while (jenis != 0);
       
       System.out.println("Total Biaya Parkir: Rp" + total);
       sc.close();
    }
}