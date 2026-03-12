/* 
   Nama File    : Lingkaran.java
   Deskripsi    : Kelas Anak Bangun Datar - Lingkaran (turunan dari BangunDatar.java)
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:12 PM 3/12/2026
*/
// Definisi kelas non-abstrak Lingkaran, turunan dari BangunDatar

public class Lingkaran extends BangunDatar
{
        /*************************ATRBUT*************************/
        private double jari;
        static final double PI = 3.14159265358979;
        
        /*************************Method*************************/
    /*************************Konstruktor*************************/
    // Konstruktor tanpa parameter
    public Lingkaran()
    {
        setJmlSisi(1);
    }
    
    // Konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border)
    {
        super(1, "hitam", "merah");
        this.jari = jari;
    }
    /*************************Selektor*************************/
    public double getJari()
    {
        return jari;
    }
    
    public double getLuas()
    {
        return PI * this.jari * this.jari;
    }

    public double getKeliling()
    {
        return 2 * PI * this.jari;
    }
    /*************************Mutator*************************/
    public void setJari(double jari)
    {
        this.jari = jari;
    }

    /*************************Method tambahan*************************/
    @Override
    public void printInfo()
    {
    super.printInfo();
    System.out.println("Jari: " + jari);
    }
}