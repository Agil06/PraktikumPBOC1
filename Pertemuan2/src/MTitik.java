/* Nama File    : MTitik.java
   Deskripsi    : Main Titik
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:29 PM 2/26/2026 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        T1.setAbsis(2);
        T1.setOrdinat(2);
        T1.PrintTitik();
        T1.geser(3, 4);
        T1.PrintTitik();
        
        // T2.setAbsis(9);
        // T2.setOrdinat(13);


// buat metode, paham mana selektor atau mutator, 

        /* 
        System.out.println("Absis: " + T1.getAbsis());
        System.out.println("Ordinat: " + T1.getOrdinat());
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Distance from origin: " + T1.getJarakPusat());
        System.out.println("Distance of T1 from T2: " + T1.getJarak(T2));
        System.out.println("Reflection to X: " + T1.getRefleksiX());
        System.out.println("Reflection to Y: " + T1.getRefleksiY());
        */
    }
}