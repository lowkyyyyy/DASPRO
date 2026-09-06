import java.util.Scanner;

public class Kasus2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah tabungan awal: ");
        double tabunganAwal = input.nextDouble();

        System.out.println("Masukkan lama menabung (Tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.println("Masukkan bunga per tahun (%): ");
        double bungaPerTahun = input.nextDouble(); // 2% per Tahun
        bungaPerTahun = bungaPerTahun / 100;

        // Rumus Bunga Majemuk: A = P(1 + r/n)^(nt)
        double tabunganAkhir = tabunganAwal * Math.pow((1 + bungaPerTahun), lamaMenabung);
        double totalBunga = tabunganAkhir - tabunganAwal;

        System.out.printf("Total Bunga didapat : Rp%.0f\n", totalBunga);
        System.out.printf("Total tabungan akhir : Rp%.0f\n", tabunganAkhir);
        input.close();


    }
}




// Input: jumlah tabungan awal, lama menabung
// Output: bunga, jumlah tabungan akhir
// Data lain = prosentase bunga = 0,02
// Proses:
// Input jumlah tabungan awal, lama menabung
// Hitung bunga = lama menabung x prosentase bunga x jumlah tabungan awal
// Hitung jumlah tabungan akhir = bunga + jumlah tabungan awal
// Output bunga dan jumlah tabungan akhir
// jml_tabungan_awal : int
// lama_menabung : int
// jml_tabungan_akhir : double
// bunga : double
// prosentase_bunga : double