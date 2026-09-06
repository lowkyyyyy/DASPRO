import java.util.Scanner;

public class Kasus1_19{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int Keliling;

        //input
        System.out.println("Masukkan panjang: ");
        panjang = input.nextInt();
        

        System.out.println("Masukkan lebar: ");
        lebar = input.nextInt();

        Keliling = 2 * (panjang + lebar);

        System.out.println("Keliling: " + Keliling);

        input.close();
    }
}



// Menentukan Algoritma:
// // Input: panjang, lebar
// // Output: Keliling
// // Proses: 
// // Input panjang dan lebar
// // Hitung keliling dengan rumus 2 * (panjang + lebar)
// // Outputkan hasil keliling
// Mengidentifikasi Variabel dan Jenis tipe data berdasarkan algortima
// panjang = int
// lebar = int
// Keliling = int