/* 
   Nama File    : Titik.java
   Deskripsi    : Kelas Titik beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 02/03/2026 
*/

public class Titik 
{
    /*************************ATRIBUT*************************/
    double absis;
    double ordinat;

    /***********************KONSTRUKTOR***********************/
    // Konstruktor tanpa parameter
    Titik() 
    {
        absis = 0;
        ordinat = 0;
    }

    /************************SELEKTOR*************************/
    // Mengembalikan nilai absis
    double getAbsis() 
    {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() 
    {
        return ordinat;
    }

    /************************MUTATOR**************************/
    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) 
    {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) 
    {
        ordinat = y;
    }

    /*********************METHOD LAIN*************************/
    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) 
    {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() 
    {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}