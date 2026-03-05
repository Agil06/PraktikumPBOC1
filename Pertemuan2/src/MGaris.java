/* Nama File    : MGaris.java
   Deskripsi    : Main Garis
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 09:43 3/5/2026 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Titik tengah G1: " + G1.getTitikTengah());
        System.out.println("Persamaan G1: " + G1.getPersamaanGaris());

        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Garis G2 = new Garis(A, B);
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
        G2.printGaris();
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());
        System.out.println("Titik tengah G2: " + G2.getTitikTengah());
        System.out.println("Persamaan G2: " + G2.getPersamaanGaris());

        System.out.println("G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus G2? " + G1.isTegakLurus(G2));
    }
}
