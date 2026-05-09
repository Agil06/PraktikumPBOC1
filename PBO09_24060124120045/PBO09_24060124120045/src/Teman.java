/**
 * NIM       : 24060124120045
 * Nama      : Agil Yudis Wibawa
 * Tanggal   : 7 Mei 2026
 * File      : Teman.java
 * Deskripsi : Implementasi kelas koleksi dasar
*/
import java.util.*;

public class Teman {
    private int nbelm; 
    private List<String> Lnama;

    /*********************KONSTRUKTOR********************/
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }
    /*********************SELECTOR********************/
    // a. getNbelm(), 
    public int getNbelm() {
        return this.nbelm;
    }
    // b. getNama(indeks), 
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    /*********************MUTATOR********************/
    // c. setNama(indeks,nama),
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }
    
    // d. addNama(nama),
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }
    
    // e. delNama(nama),
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }
    
    /*********************METHOD LAIN********************/
    // f. isMember(nama),
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama,namabaru),
    public void gantiNama(String nama, String namabaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namabaru);
        }
    }

    // h. countNama(nama),
    public int countNama(String nama) {
        return Collections.frequency(Lnama, nama);
    }

    // i. showTeman()
    public void showTeman() {
        System.out.println("Daftar Teman (" + nbelm + " orang):");
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}