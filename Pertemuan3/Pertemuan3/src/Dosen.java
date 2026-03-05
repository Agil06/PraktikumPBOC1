/* 
   Nama File    : Dosen.java
   Deskripsi    : Kelas dosen beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

public class Dosen 
{
    /*************************ATRIBUT*************************/
    private String NIP;
    private String Nama;
    private String Prodi;

    /*************************METHOD*************************/
    // Konstruktor tanpa parameter
    public Dosen()
    {
        this("", "", "");
    }

    // Konstruktor dengan parameter
    public Dosen(String NIP, String Nama, String Prodi)
    {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    /************************SELEKTOR*************************/
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    /************************MUTATOR**************************/
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}
