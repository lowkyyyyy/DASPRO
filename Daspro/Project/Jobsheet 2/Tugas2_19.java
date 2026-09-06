import java.util.Scanner;

public class Tugas2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel
        double PanjangTanah;
        double LebarTanah;
        double DiameterKolam;
        double SisiTaman;
        double LuasTanah;
        double JariJariKolam;
        double LuasKolam;
        double LuasTaman;
        double LuasTanahTersisa;

        // Input
        System.out.print("Masukkan Panjang Tanah (m): ");
        PanjangTanah = input.nextDouble();
        System.out.print("Masukkan Lebar Tanah (m): ");
        LebarTanah = input.nextDouble();
        System.out.print("Masukkan Diameter Kolam (m): ");
        DiameterKolam = input.nextDouble();
        System.out.print("Masukkan Sisi Taman (m): ");
        SisiTaman = input.nextDouble();

        // Proses
        LuasTanah = PanjangTanah * LebarTanah;
        JariJariKolam = DiameterKolam / 2;
        LuasKolam = 3.14 * JariJariKolam * JariJariKolam;
        LuasTaman = SisiTaman * SisiTaman;
        LuasTanahTersisa = LuasTanah - LuasKolam - LuasTaman;   

        // Output
        System.out.println("Luas Tanah: " + LuasTanah + " m^2");
        System.out.println("Luas Kolam: " + LuasKolam + " m^2");
        System.out.println("Luas Taman: " + LuasTaman + " m^2");
        System.out.println("Luas Tanah Tersisa: " + LuasTanahTersisa + " m^2");

        input.close();
    }
}



// tanpa scanner
// // public class tugas2_25 {
//     public static void main(String[] args) {
//         // Deklarasi & Inisialisasi Statis
//         double lebarTanah = 30;
//         double panjangTanah = 100;
//         double diameterKolam = 5;
//         double sisiTaman = 2;

//         // Proses
//         double luasTanah = panjangTanah * lebarTanah;
//         double jariJari = diameterKolam / 2;
//         double luasKolam = Math.PI * jariJari * jariJari;
//         double luasTaman = sisiTaman * sisiTaman;
//         double luasSisa = luasTanah - luasKolam - luasTaman;

//         // Output
//         System.out.println("Luas tanah keseluruhan    : " + luasTanah + " m2");
//         System.out.println("Luas kolam ikan           : " + luasKolam + " m2");
//         System.out.println("Luas taman bunga          : " + luasTaman + " m2");
//         System.out.println("Luas tanah tidak digunakan: " + luasSisa + " m2");
//     }
// }