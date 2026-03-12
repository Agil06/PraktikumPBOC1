/* 
   Nama File    : BangunDatar.java
   Deskripsi    : Kelas Template Bangun Datar - Implementasi Simple Inheritance
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:12 PM 3/12/2026
*/

// Definisi kelas abstrak bangun datar


public abstract class BangunDatar {
    /*************************ATRIBUT*************************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;
    
    /*************************METHOD*************************/
    /*************************Konstruktor*************************/
    // Konstruktor tanpa parameter
    public BangunDatar()
    {
        counterBangunDatar++;
        
    }
    
    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border)
    {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
        
    }
    
    /*************************Selektor*************************/
    public int getJmlSisi()
    {
        return jmlSisi;
    }
    
    public String getWarna()
    {
        return warna;
    }

    public String getBorder()
    {
        return border;
    }

    /*************************Mutator*************************/
    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }
    
    public void setWarna(String warna)
    {
        this.warna = warna;
    }

    public void setBorder(String border)
    {
        this.border = border;
    }
    
    /*************************Method Tambahan*************************/
    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar()
    {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }
}
