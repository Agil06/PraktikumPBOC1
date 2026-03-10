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

    /***********************KONSTRUKTOR***********************/
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
    // Mengembalikan ID mata kuliah
    public String getMatkul()
    {
        return idMatKul;
    }

    // Mengembalikan jumlah SKS mata kuliah
    public int getSKS()
    {
        return SKS;
    }

    /************************MUTATOR**************************/
    // Mengeset ID mata kuliah
    public void setMatkul(String idMatKul)
    {
        this.idMatKul = idMatKul;
    }
    
    // Mengeset jumlah SKS mata kuliah
    public void setSKS(int SKS)
    {
        this.SKS = SKS;
    }
}