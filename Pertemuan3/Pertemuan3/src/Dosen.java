public class Dosen 
{
    private String NIP;
    private String Nama;
    private String Prodi;

    public Dosen()
    {
        this("", "", "");
    }

    public Dosen(String NIP, String Nama, String Prodi)
    {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }
}
