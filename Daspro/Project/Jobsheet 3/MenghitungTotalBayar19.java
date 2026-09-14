import java.util.Scanner;

public class MenghitungTotalBayar19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.print("Masukkan harga barang: "); 
        harga = input.nextDouble();
        potongan = harga * diskon;
        jml_bayar = harga - potongan;
        System.out.println("Total bayar setelah diskon: Rp " + jml_bayar);

        input.close();
    }

    
}
