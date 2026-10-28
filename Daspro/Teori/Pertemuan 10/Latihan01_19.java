public class Latihan01_19 {
    public static void main (String[] args) {

        // Segitiga 1
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Segitiga 2
        int n = 10;
        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}