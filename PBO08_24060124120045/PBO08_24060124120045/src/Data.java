/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026
 * File       : Data.java
 * Deskripsi  : Kelas Generik 
 */

public class Data<T> {
    /************ATRIBUT****************/
    private T[] ruang;
    private int banyak;
    private static final int maxKapasitas = 100;

    /**********METHOD*******************/
    //KONSTRUKTOR
    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[maxKapasitas];
        this.banyak = 0;
    }

    //SELECTOR
    public T getIsi(int indeks) {
        if (indeks >= 1 && indeks <= 100) {
            return ruang[indeks - 1];
        }
        return null; 
    }

    //MUTATOR
    public void setIsi(int indeks, T elemen) {
        if (indeks >= 1 && indeks <= 100) {
            if (ruang[indeks - 1] == null && elemen != null) {
                banyak++;
            } else if (ruang[indeks - 1] != null && elemen == null) {
                banyak--;
            }
            ruang[indeks - 1] = elemen;
        } else {
            System.out.println("Indeks harus berada di antara 1 hingga 100.");
        }
    }

    //METHOD TAMBAHAN
    public int getSize() {
        return banyak;
    }
}
