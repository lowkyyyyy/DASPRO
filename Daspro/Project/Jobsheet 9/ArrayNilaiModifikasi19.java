import java.util.Scanner;

public class ArrayNilaiModifikasi19 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Soal 3: tampilan pakai foreach, nomor mahasiswa dihitung manual
        System.out.println("\n--- Semua mahasiswa ---");
        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }

        // Soal 2: hanya tampilkan yang lulus
        System.out.println("\n--- Mahasiswa yang lulus saja ---");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }

        // Soal 4: hitung jumlah lulus dan tidak lulus
        int lulus = 0;
        int tidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("\nJumlah mahasiswa lulus       : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);

        sc.close();
    }
}
