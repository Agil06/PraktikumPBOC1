/* Nama File    : MTitik.java
   Deskripsi    : Main Titik
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:29 PM 2/26/2026 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        T1.setAbsis(2);
        T1.setOrdinat(2);
        System.out.print("T1 awal: ");
        T1.PrintTitik();

        T1.geser(3, 4);
        System.out.print("T1 setelah digeser: ");
        T1.PrintTitik();

        System.out.println("Absis T1: " + T1.getAbsis());
        System.out.println("Ordinat T1: " + T1.getOrdinat());
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Jarak T1 dari pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 dari T2: " + T1.getJarak(T2));

        Titik T3 = T1; // referensi objek
        System.out.print("T3 sebelum T1 diubah: ");
        T3.PrintTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.print("T1 setelah diubah: ");
        T1.PrintTitik();
        System.out.print("T3 setelah T1 diubah (ikut berubah karena referensi sama): ");
        T3.PrintTitik();

        Titik refleksiX = T2.getRefleksiX();
        Titik refleksiY = T2.getRefleksiY();
        System.out.print("T2: ");
        T2.PrintTitik();
        System.out.println("Refleksi T2 terhadap sumbu X: " + refleksiX);
        System.out.println("Refleksi T2 terhadap sumbu Y: " + refleksiY);
    }
}


