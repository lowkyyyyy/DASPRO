import java.util.Scanner;

public class ArrayRataNilaiModifikasi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Soal 1
//         System.out.print("Masukkan jumlah mahasiswa: ");
//         int jumlahMhs = sc.nextInt();

//         int[] nilaiMhs = new int[jumlahMhs];
//         int total = 0;
//         double rata2;
//         int jumlahLulus = 0;

//         for (int i = 0; i < nilaiMhs.length; i++) {
//             System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
//             nilaiMhs[i] = sc.nextInt();
//             total += nilaiMhs[i];
            
//             if (nilaiMhs[i] > 70) {
//                 jumlahLulus++;
//             }
//         }

//         rata2 = (double) total / nilaiMhs.length;
//         System.out.println("\n--- Hasil Perhitungan ---");
//         System.out.println("Total nilai : " + total);
//         System.out.println("Rata - rata : " + rata2);
//         System.out.println("Jumlah mahasiswa yang lulus : " + jumlahLulus);

//         int tertinggi = nilaiMhs[0];
//         int terendah = nilaiMhs[0];
//         for (int i = 1; i < nilaiMhs.length; i++) {
//             if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
//             if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
//         }
//         System.out.println("Nilai Tertinggi : " + tertinggi);
//         System.out.println("Nilai Terendah : " + terendah);

//     }
// }
         // Soal 2
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total nilai : " + total);
        System.out.println("Rata - rata : " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus : " + jumlahLulus);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);

        sc.close();
    }
}