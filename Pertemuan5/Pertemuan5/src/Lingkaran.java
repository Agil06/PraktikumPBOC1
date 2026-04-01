/* 
   Nama File    : Lingkaran.java
   Deskripsi    : Kelas Anak Bangun Datar
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 01/04/2026
*/

public class Lingkaran extends BangunDatar implements IResize {
    
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
    
    @Override
    public double getLuas()
    {
        return PI * this.jari * this.jari;
    }
    
    @Override
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
    
    @Override
    public void zoomIn() 
    {
        this.jari *= 2;
    }
    
    @Override
    public void zoomOut() 
    {
        this.jari /= 2;
    }
    
    @Override
    public void zoom(double factor) 
    {
        this.jari *= factor;
    }
}