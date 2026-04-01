/* 
   Nama File    : MBangunDatar.java
   Deskripsi    : Main class untuk eksperimen BangunDatar, Persegi, dan Lingkaran
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 01/04/2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // Akan error karena abstract class
        BangunDatar P1 = new Persegi(10, "merah", "hitam");
        Persegi P2 = new Persegi(5, "biru", "kuning");
        BangunDatar L1 = new Lingkaran(7, "hijau", "biru");
        Lingkaran L2 = new Lingkaran(14, "ungu", "merah");

        // Print info
        System.out.println("== Info Persegi P1 ==");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());

        System.out.println("\n== Info Persegi P2 ==");
        P2.printInfo();
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());

        System.out.println("\n== Info Lingkaran L1 ==");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        System.out.println("\n== Info Lingkaran L2 ==");
        L2.printInfo();
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());

        // Eksperimen perbandingan
        System.out.println("\nP1 dan P2 sama luas? " + P1.isEqualLuas(P2));
        System.out.println("P1 dan L1 sama keliling? " + P1.isEqualKeliling(L1));
        System.out.println("L1 dan L2 sama luas? " + L1.isEqualLuas(L2));

        // Eksperimen IResize
        System.out.println("\n== Eksperimen IResize pada Persegi P2 ==");
        P2.printInfo();
        P2.zoomIn();
        System.out.println("Setelah zoomIn:");
        P2.printInfo();
        P2.zoomOut();
        System.out.println("Setelah zoomOut:");
        P2.printInfo();
        P2.zoom(3);
        System.out.println("Setelah zoom(3):");
        P2.printInfo();

        System.out.println("\n== Eksperimen IResize pada Lingkaran L2 ==");
        L2.printInfo();
        L2.zoomIn();
        System.out.println("Setelah zoomIn:");
        L2.printInfo();
        L2.zoomOut();
        System.out.println("Setelah zoomOut:");
        L2.printInfo();
        L2.zoom(0.5);
        System.out.println("Setelah zoom(0.5):");
        L2.printInfo();
    }
}