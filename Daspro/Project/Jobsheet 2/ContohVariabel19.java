public class ContohVariabel19 {
    public static void main(String[] args) {
       String salahSatuHobySayaAdalah = "Bermain Game";
       boolean IsPandai = true;
       char jenisKelamin = 'L';
       byte umur = 20;
       double $ipk = 3.24, tinggi = 1.78;
       System.out.println(salahSatuHobySayaAdalah);
       System.out.println("Apakah saya pandai? " + IsPandai);
       System.out.println("Jenis kelamin: " + jenisKelamin);
       System.out.println("Umur: " + umur);
       System.out.println(String.format("BerIPK: %s, dengan Tinggi: %s", $ipk, tinggi));
    }
}