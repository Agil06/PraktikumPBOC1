/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Burung.java
 * Deskripsi  : Kelas burung
 */
public class Burung extends Anabul {
    /**********METHOD*******************/
    //KONSTRUKTOR
    public Burung(String nama) { super(nama); }

    //METHOD TAMBAHAN
    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan terbang."); }
    @Override
    public void bersuara() { System.out.println(nama + " berbunyi cuit."); }
}