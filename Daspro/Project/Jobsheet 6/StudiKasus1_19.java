import java.util.Scanner;

public class StudiKasus1_19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar = 0;
        int kembalian, kurang;

        System.out.println("Masukkan Jumlah Cup");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan Uang Yang Dibayarkan");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga;
        }

        System.out.println("Total harga : Rp" + totalHarga);
        System.out.println("Diskon : Rp" + diskon);
        System.out.println("Total Bayar : Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Kurang : Rp" + kurang);
        }
        sc.close();
    }
}
