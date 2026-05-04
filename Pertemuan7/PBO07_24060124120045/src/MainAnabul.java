/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : MainAnabul.java
 * Deskripsi  : Anabul - polimorfisme universal inclusion
 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul peliharaan1 = new Kucing("Pepeng");
        Anabul peliharaan2 = new Anjing("Hachiko");
        Anabul peliharaan3 = new Burung("Icikiwir");

        peliharaan1.gerak(); peliharaan1.bersuara();
        peliharaan2.gerak(); peliharaan2.bersuara();
        peliharaan3.gerak(); peliharaan3.bersuara();
    }
}