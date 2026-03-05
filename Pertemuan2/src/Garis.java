/* 
   Nama File    : Garis.java
   Deskripsi    : Kelas Garis beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

public class Garis 
{
    /*************************ATRIBUT*************************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************************METHOD*************************/
    // Konstruktor tanpa parameter: (0,0) ke (1,1)
    public Garis()
    {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // Konstruktor dengan parameter titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir)
    {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    /************************SELEKTOR*************************/
    public Titik getTitikAwal() { return titikAwal; }
    public Titik getTitikAkhir() { return titikAkhir; }
    public static int getCounterGaris() { return counterGaris; }

    // Mendapatkan panjang garis
    public double getPanjang()
    {
        return titikAwal.getJarak(titikAkhir);
    }

    // Mendapatkan gradien garis (m)
    public double getGradien()
    {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0)
        {
            throw new ArithmeticException("Gradien tidak terdefinisi untuk garis vertikal");
        }
        return dy / dx;
    }

    // Mendapatkan titik tengah garis
    public Titik getTitikTengah()
    {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2.0;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2.0;
        return new Titik(xTengah, yTengah);
    }

    // Mendapatkan persamaan garis y = mx + c
    public String getPersamaanGaris()
    {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }

    /************************MUTATOR**************************/
    public void setTitikAwal(Titik titikAwal) { this.titikAwal = titikAwal; }
    public void setTitikAkhir(Titik titikAkhir) { this.titikAkhir = titikAkhir; }

    /*********************METHOD LAIN*************************/
    // Cek sejajar dengan garis lain
    public boolean isSejajar(Garis G)
    {
        return this.getGradien() == G.getGradien();
    }

    // Cek tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G)
    {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir
    public void printGaris()
    {
        System.out.println("Garis dari " + titikAwal + " ke " + titikAkhir);
    }
}
