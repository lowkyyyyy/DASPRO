import java.util.Scanner;

public class Tugas1_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Variabel
        double gajiPokok;
        int jumlahAnak;
        double tunjanganPerAnak = 100000;
        double persenPensiun = 0.10;
        double totalTunjangan;
        double potonganPensiun;
        double gajiBersih;

        // Input
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        // Proses
        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = gajiPokok * persenPensiun;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        // Output
        System.out.println("Total Tunjangan anak    : Rp" + totalTunjangan);
        System.out.println("Potongan Pensiun        : Rp" + potonganPensiun);
        System.out.println("Gaji Bersih Pak Danur   : Rp" + gajiBersih);

        input.close();

    }
}
