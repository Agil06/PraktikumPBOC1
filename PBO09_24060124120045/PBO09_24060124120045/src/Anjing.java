/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Anjing.java
 * Deskripsi  : Kelas anjing
 */
public class Anjing extends Anabul {
    public Anjing(String nama) { super(nama); }

    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan berlari."); }
    @Override
    public void bersuara() { System.out.println(nama + " berbunyi guk guk."); }
}