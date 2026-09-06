import java.util.Scanner;

public class Tugas1_19 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        // Variabel
        double GajiPokok;
        int JumlahAnak;
        double TunjanganperAnak = 100000;
        double PersenPensiun = 0.10;
        double TotalTunjangan;
        double PotonganPensiun;
        double GajiBersih;

        // Input
        System.out.print("Masukkan Gaji Pokok: ");
        GajiPokok = input.nextDouble();

        System.out.print("Masukkan Jumlah Anak: ");
        JumlahAnak = input.nextInt();

        // Proses
        TotalTunjangan = JumlahAnak * TunjanganperAnak;
        PotonganPensiun = GajiPokok * PersenPensiun;
        GajiBersih = GajiPokok + TotalTunjangan - PotonganPensiun;

        // Output
        System.out.println("Total Tunjangan: Rp " + TotalTunjangan);
        System.out.println("Potongan Pensiun: Rp " + PotonganPensiun);
        System.out.println("Gaji Bersih: Rp " + GajiBersih);

        input.close();
    }
}




// Tanpa Scanner

// public class tugas1_25 {
//     public static void main(String[] args) {
//         // Deklarasi & Inisialisasi Statis
//         double gajiPokok = 5000000;
//         int jumlahAnak = 4;
//         double tunjanganPerAnak = 100000;
//         double persenPensiun = 0.10;

//         // Proses
//         double totalTunjangan = jumlahAnak * tunjanganPerAnak;
//         double potonganPensiun = persenPensiun * gajiPokok;
//         double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

//         // Output
//         System.out.println("Gaji Pokok            : Rp" + gajiPokok);
//         System.out.println("Jumlah Anak           : " + jumlahAnak);
//         System.out.println("Total Tunjangan Anak  : Rp" + totalTunjangan);
//         System.out.println("Potongan Pensiun (10%): Rp" + potonganPensiun);
//         System.out.println("Gaji Bersih Pak Danur : Rp" + gajiBersih);
//     }
// }