/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026 2026
 * File       : Datum.java
 * Deskripsi  : Kelas Generik 
 */

public class Datum<T> {
    /************ATRIBUT****************/
    private T isi;

    /**********METHOD*******************/
    //SELECTOR
    public T getIsi() {
        return this.isi;
    }

    //MUTATOR
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}
