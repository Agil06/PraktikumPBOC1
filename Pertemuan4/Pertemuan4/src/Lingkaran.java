/* 
   Nama File    : Lingkaran.java
   Deskripsi    : Kelas Anak Bangun Datar - Lingkaran
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:12 PM 3/12/2026
*/

public class Lingkaran extends BangunDatar
{
    private double jari;
    static final double PI = 3.14159265358979;

    public Lingkaran()
    {
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border)
    {
        super(1, "hitam", "merah");
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari()
    {
        return jari;
    }

    public void setJari(double jari)
    {
        this.jari = jari;
    }

    public double getLuas()
    {
        return PI * this.jari * this.jari;
    }

    public double getKeliling()
    {
        return 2 * PI * this.jari;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari: " + jari);
    }
}