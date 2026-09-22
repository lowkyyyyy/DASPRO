import java.util.Scanner;

public class Tugas5_1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int Lamaparkir;
        int tarif;

        System.out.println("Masukkan Lama Parkir (Jam)");
        Lamaparkir = input.nextInt();

        if (Lamaparkir <= 2 ){
            tarif = 2000;

        }else {
            tarif = 2000 + (Lamaparkir - 2) * 1000;

        }
        
        System.out.println("Tarif Parkir" + tarif);

        input.close();
    }
   

}