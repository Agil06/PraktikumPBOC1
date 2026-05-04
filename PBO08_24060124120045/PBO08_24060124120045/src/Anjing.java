/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Anjing.java
 * Deskripsi  : Kelas Anjing
 */
public class Anjing extends Anabul {
    /**********METHOD*******************/
    //KONSTRUKTOR
    public Anjing(String nama) { super(nama); }

    //METHOD TAMBAHAN
    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan melata."); }
    @Override
    public void bersuara() { System.out.println(nama + " bersuara guk-guk."); }
}