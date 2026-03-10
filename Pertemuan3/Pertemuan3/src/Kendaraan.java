/* 
   Nama File    : Kendaraan.java
   Deskripsi    : Kelas kendaraan beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

public class Kendaraan 
{
    /*************************ATRIBUT*************************/
    private String noPlat;
    private String jenis;

    /***********************KONSTRUKTOR***********************/
    // Konstruktor tanpa parameter
    public Kendaraan()
    {
        this("", "");
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis)
    {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /************************SELEKTOR*************************/
    // Mengembalikan nomor plat kendaraan
    public String noPlat()
    {
        return noPlat;
    }
    
    // Mengembalikan jenis kendaraan
    public String jenis()
    {
        return jenis;
    }

    /************************MUTATOR**************************/
    // Mengeset nomor plat kendaraan
    public void setnoPlat(String noPlat)
    {
        this.noPlat = noPlat;
    }
    
    // Mengeset jenis kendaraan
    public void setjenis(String jenis)
    {
        this.jenis = jenis;
    }
}
