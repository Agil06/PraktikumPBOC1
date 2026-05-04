/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026
 * File       : MainData.java
 * Deskripsi  : Driver Data
 */

public class MainData {
    /**********METHOD*******************/
    //MAIN METHOD
    public static void main(String[] args) {
        // a. Aplikasi kelas data untuk keluarga objek anabul
        System.out.println("Membuat objek data untuk anabul");
        Data<Anabul> dataAnabul = new Data<>();
        
        // b. Realisasi prosedur setIsi disertai aplikasi untuk keluarga objek anabul
        System.out.println("\nMenjalankan setIsi()");
        Anabul kucing = new Kucing("Kitty");      
        Anabul anjing = new Anjing("Doggy");      
        Anabul burung = new Burung("Pio");      

        dataAnabul.setIsi(1, kucing);
        System.out.println("Mengisi posisi 1 dengan " + kucing.getClass().getSimpleName());
        
        dataAnabul.setIsi(2, anjing);
        System.out.println("Mengisi posisi 2 dengan " + anjing.getClass().getSimpleName());
        
        dataAnabul.setIsi(100, burung);
        System.out.println("Mengisi posisi 100 dengan " + burung.getClass().getSimpleName());

        // c. Realisasi fungsi getIsi disertai aplikasi untuk keluarga objek anabul
        System.out.println("\nMenjalankan getIsi()");
        Anabul anabul1 = dataAnabul.getIsi(1);
        System.out.println("Anabul pada posisi 1 adalah: " + (anabul1 != null ? anabul1.getClass().getSimpleName() : "Kosong"));
        
        Anabul anabul2 = dataAnabul.getIsi(2);
        System.out.println("Anabul pada posisi 2 adalah: " + (anabul2 != null ? anabul2.getClass().getSimpleName() : "Kosong"));
        
        Anabul anabul10 = dataAnabul.getIsi(10); // Belum diisi
        System.out.println("Anabul pada posisi 10 adalah: " + (anabul10 != null ? anabul10.getClass().getSimpleName() : "Kosong"));

        // d. Realisasi fungsi getSize disertai aplikasi untuk keluarga objek anabul
        System.out.println("\nMenjalankan getSize()");
        System.out.println("Banyak elemen efektif saat ini (getSize): " + dataAnabul.getSize() + " Anabul");
    }
}
