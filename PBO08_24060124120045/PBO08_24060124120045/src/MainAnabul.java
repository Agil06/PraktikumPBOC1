/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026
 * File       : MainAnabul.java
 * Deskripsi  : Anabul - polimorfisme universal inclusion
 */

public class MainAnabul {
    /**********METHOD*******************/
    //MAIN METHOD
    public static void main(String[] args) {
        Anabul peliharaan1 = new Kucing("Pepeng");
        Anabul peliharaan2 = new Anjing("Hachiko");
        Anabul peliharaan3 = new Burung("Icikiwir");
        Anabul peliharaan4 = new Anggora("Snowy");
        Anabul peliharaan5 = new Kembangtelon("Belang");

        peliharaan1.gerak(); peliharaan1.bersuara();
        peliharaan2.gerak(); peliharaan2.bersuara();
        peliharaan3.gerak(); peliharaan3.bersuara();
        peliharaan4.gerak(); peliharaan4.bersuara();
        peliharaan5.gerak(); peliharaan5.bersuara();
    }
}