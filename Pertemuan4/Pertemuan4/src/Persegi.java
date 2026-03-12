/* 
   Nama File    : Persegi.java
   Deskripsi    : Kelas Anak Bangun Datar - Persegi
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:12 PM 3/12/2026
*/


public class Persegi extends BangunDatar
{
    private double sisi;

    public Persegi()
    {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border)
    {
        super(4, "pink", "biru");
        this.sisi = sisi;
    }
    public double getSisi()
    {
        return sisi;
    }

    public void setSisi(double sisi)
    {
        this.sisi = sisi;
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

    @Override
    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }
}