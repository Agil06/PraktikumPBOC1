/* 
   Nama File    : Persegi.java
   Deskripsi    : Kelas Anak Bangun Datar - Persegi (turunan dari BangunDatar.java)
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:12 PM 3/12/2026
*/

// Definisi kelas non-abstrak Persegi, turunan dari BangunDatar

public class Persegi extends BangunDatar
{
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

    public double getLuas()
    {
        return 2 * sisi;
    }
    
    public double getKeliling()
    {
        return sisi + sisi + sisi + sisi;
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
}