import java.util.Scanner;

public class GajiKaryawan19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTransportasi = 600000; // 
        double tunjanganMakan = 400000 ;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextInt();
        bonus = 0.05*gajiPokok;
        System.out.print("Masukkan bonus: ");
        bonus = input.nextDouble();
        totalGaji = gajiPokok + tunjanganTransportasi + tunjanganMakan + bonus - 0.1*gajiPokok;
        System.out.println("Total gaji karyawan adalah: Rp " + (int) totalGaji);
        System.out.println("Bonus karyawan adalah: Rp " + (int) bonus);
        System.out.println("Gaji pokok karyawan adalah: Rp " + gajiPokok);
        
        input.close();
    }
    
}
