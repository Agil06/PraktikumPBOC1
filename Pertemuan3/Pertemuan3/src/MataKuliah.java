/* 
   Nama File    : MataKuliah.java
   Deskripsi    : Kelas MataKuliah beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

public class MataKuliah 
{
    /*************************ATRIBUT*************************/
    private String idMatKul;
    private int SKS;

    /*************************METHOD*************************/
    // Konstruktor tanpa parameter
    public MataKuliah() 
    {
        this("", 0);
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, int SKS)
    {
        this.idMatKul = idMatKul;
        this.SKS = SKS;
    }

    /************************SELEKTOR*************************/
    public String getMatkul()
    {
        return idMatKul;
    }

    public int getSKS()
    {
        return SKS;
    }

    /************************MUTATOR**************************/
    public void setMatkul(String idMatKul)
    {
        this.idMatKul = idMatKul;
    }
    
    public void setSKS(int SKS)
    {
        this.SKS = SKS;
    }
}