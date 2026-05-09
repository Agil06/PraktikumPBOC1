/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Anabul.java
 * Deskripsi  : Kelas anabul
 */
public class Anabul {
    /************ATRIBUT****************/
    protected String nama;
    protected String panggilan;

    /**********METHOD**********/
    //KONSTRUKTOR
    public Anabul(String nama) { this.nama = nama; }

    //GETTER & SETTER
    public String getNama() { 
        return this.nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getPanggilan() { 
        return this.panggilan; 
    }
    public void setPanggilan(String panggilan) { 
        this.panggilan = panggilan; 
    }

    //METHOD TAMBAHAN
    public void gerak() { 
        System.out.println(nama + " bergerak."); 
    }
    public void bersuara() { 
        System.out.println(nama + " bersuara."); 
    }
}