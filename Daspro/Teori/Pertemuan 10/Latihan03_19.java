public class Latihan03_19 {
    public static void main (String[] args) {
        for (int n = 1; n <= 5; n++) {
            int totalJumlah = 0;
            System.out.print("n = " + n + " -> Jumlah kuadrat = ");
            for (int i = 1; i <= n; i++) {
            int kuadrat = 0;

            for (int j = 1; j <= i; j++){
            kuadrat += i;
            }
            totalJumlah += kuadrat;
            System.out.print(kuadrat);
        
            if (i < n) {
            System.out.print(" + ");
            }

        }
        System.out.println(" = " + totalJumlah);



       }
    }
}