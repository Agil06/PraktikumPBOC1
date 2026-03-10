/* 
   Nama File    : Titik.java
   Deskripsi    : Kelas Titik beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 26/02/2026 
*/

public class Titik 
{
    /*************************ATRIBUT*************************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***********************KONSTRUKTOR***********************/
    // Konstruktor tanpa parameter (menghasilkan titik (0,0))
    public Titik()
    {
        this(0, 0);
    }

    // Konstruktor dengan parameter absis dan ordinat
    public Titik(double absis, double ordinat)
    {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    /************************SELEKTOR*************************/
    // Mengembalikan nilai counterTitik
    public static int getCounterTitik()
    {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis()
    {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat()
    {
        return ordinat;
    }

    // Mengembalikan kuadran titik
    public int getKuadran()
    {
        if (absis > 0 && ordinat > 0)
        {
            return 1;
        }
        else if (absis < 0 && ordinat > 0)
        {
            return 2;
        }
        else if (absis < 0 && ordinat < 0)
        {
            return 3;
        }
        else if (absis > 0 && ordinat < 0)
        {
            return 4;
        }
        return 0;
    }

    // Mengembalikan jarak titik dari pusat koordinat (0,0)
    public double getJarakPusat()
    {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Mengembalikan jarak titik dari titik lain T
    public double getJarak(Titik T)
    {
        return Math.sqrt(Math.pow((T.absis - this.absis), 2) + Math.pow((T.ordinat - this.ordinat), 2));
    }

    // Mengembalikan titik baru hasil refleksi terhadap sumbu X
    public Titik getRefleksiX()
    {
        return new Titik(this.absis, this.ordinat * -1);
    }

    // Mengembalikan titik baru hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY()
    {
        return new Titik(this.absis * -1, this.ordinat);
    }

    /************************MUTATOR**************************/
    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x)
    {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y)
    {
        ordinat = y;
    }

    /*********************METHOD LAIN*************************/
    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y)
    {
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    // Mencetak koordinat titik
    public void PrintTitik()
    {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }

    // Merefleksikan titik terhadap sumbu X
    public void refleksiX()
    {
        this.ordinat = this.ordinat * -1;
    }

    // Merefleksikan titik terhadap sumbu Y
    public void refleksiY()
    {
        this.absis = this.absis * -1;
    }

    // Mengembalikan representasi string dari titik
    @Override
    public String toString()
    {
        return "(" + this.absis + ", " + this.ordinat + ")";
    }
}