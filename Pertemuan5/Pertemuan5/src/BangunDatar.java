/* 
Nama File    : BangunDatar.java
Deskripsi    : Kelas Template Bangun Datar 
Pembuat      : Agil Yudis Wibawa (24060124120045)
Tanggal      : 01/04/2026
*/

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
    
    // Abstract Method, realisasikan di anak
    public abstract double getLuas();
    public abstract double getKeliling();

    // Method untuk membandingkan luas
    public boolean isEqualLuas(BangunDatar X) 
    {
        return this.getLuas() == X.getLuas();
    }
    
    // Method untuk membandingkan keliling
    public boolean isEqualKeliling(BangunDatar X) 
    {
        return this.getKeliling() == X.getKeliling();
    }
}