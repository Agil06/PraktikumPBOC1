/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Kucing.java
 * Deskripsi  : Kelas kucing
 */
public class Kucing extends Anabul {
    /************ATRIBUT****************/
    public double bobot;
    
    /**********METHOD*******************/
    //KONSTRUKTOR
    public Kucing(String nama) { super(nama); }

    //METHOD TAMBAHAN
    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan melata."); }
    @Override
    public void bersuara() { System.out.println(nama + " berbunyi nyaaaa~."); }
}