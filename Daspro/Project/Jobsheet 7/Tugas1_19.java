import java.util.Scanner;

public class Tugas1_19{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiket = 0, jumlahTiket, totalPenjualan = 0;
        double diskon, totalBayar;

        while(true) {
            System.out.println("Masukkan Jumlah Tiket Yang Dibeli");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Transaksi Selesai");
                break;
            }
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silahkan input ulang");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            totalBayar = jumlahTiket * hargaTiket;
            totalBayar = totalBayar - (totalBayar * diskon);

            totalPenjualan += totalBayar;
            totalTiket += jumlahTiket;

            System.out.println("Total Diskon : " + (diskon * 100) + "%");
            System.out.println("Total Bayar : Rp" + totalBayar);
            System.out.println("");

        }   

        System.out.println("===== RESI TIKET =====");
        System.out.println("Total Tiket : " + totalTiket);
        System.out.println("Total Terjual : " + totalPenjualan);

        sc.close();
    }
}