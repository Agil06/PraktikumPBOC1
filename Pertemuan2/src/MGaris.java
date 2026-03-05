/* 
   Nama File    : MGaris.java
   Deskripsi    : Driver Garis yang berisi aplikasi tiap method pada kelas Garis.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

public class MGaris 
{
    public static void main(String[] args) 
    {
        // Membuat garis default (0,0) ke (1,1)
        Garis G1 = new Garis();
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Titik tengah G1: " + G1.getTitikTengah());
        System.out.println("Persamaan G1: " + G1.getPersamaanGaris());

        // Membuat garis dari titik A(-2,0) ke titik B(0,4)
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Garis G2 = new Garis(A, B);
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
        G2.printGaris();
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.println("Titik tengah G2: " + G2.getTitikTengah());
        System.out.println("Persamaan G2: " + G2.getPersamaanGaris());

        // Mengecek relasi antar dua garis
        System.out.println("G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus G2? " + G1.isTegakLurus(G2));
    }
}
