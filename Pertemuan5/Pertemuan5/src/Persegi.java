/* 
   Nama File    : Persegi.java
   Deskripsi    : Kelas Anak Bangun Datar
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 01/04/2026
*/

public class Persegi extends BangunDatar implements IResize {
    
    /*************************ATRIBUT*************************/
    private double sisi;
    
    /*************************METHOD*************************/
    /*************************Konstruktor*************************/
    // Konstruktor tanpa parameter
    public Persegi()
    {
        setJmlSisi(4);
    }
    
    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border)
    {
        super(4, "pink", "biru");
        this.sisi = sisi;
    }
    
    /*************************Selektor*************************/
    public double getSisi()
    {
        return sisi;
    }
    
    @Override
    public double getLuas()
    {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling()
    {
        return 4 * sisi;
    }
    
    public double getDiagonal()
    {
        return sisi * Math.sqrt(2);
    }
    
    /*************************Mutator*************************/
    public void setSisi(double sisi)
    {
        this.sisi = sisi;
    }
    
    /*************************Method Tambahan*************************/
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        this.sisi *= 2;
    }
    
    @Override
    public void zoomOut() {
        this.sisi /= 2;
    }
    
    @Override
    public void zoom(double factor) {
        this.sisi *= factor;
    }
}