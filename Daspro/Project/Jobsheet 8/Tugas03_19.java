import java.util.Scanner;

public class Tugas03_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int totalSeluruh = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println();
            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + pelanggan + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif!");
                    }
                } while (barang < 0);

                totalBarangToko += barang;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalSeluruh += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println();
        System.out.println("Total barang seluruh toko: " + totalSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}

