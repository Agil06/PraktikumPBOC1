/* 
   Nama File    : Mahasiswa.java
   Deskripsi    : Kelas Mahasiswa beserta atribut dan methodnya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

import java.util.ArrayList;

public class Mahasiswa 
{
    /*************************ATRIBUT*************************/
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MataKuliah> listMatkul; // 0..50 mata kuliah
    private Dosen dosenWali;                  // 1 dosen wali (wajib)
    private Kendaraan kendaraan;              // 0..1 kendaraan
    
    /*************************METHOD*************************/
    // Konstruktor tanpa parameter
    public Mahasiswa()
    {
        this("", "", "", null);
    }
    
    // Konstruktor dengan parameter
    public Mahasiswa(String NIM, String Nama, String Prodi, Dosen dosenWali)
    {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.dosenWali = dosenWali;
        this.listMatkul = new ArrayList<MataKuliah>();
        this.kendaraan = null;
    }
    
    /************************SELEKTOR*************************/
    public String getNIM() { return NIM; }
    public String getNama() { return Nama; }
    public String getProdi() { return Prodi; }
    public Dosen getDosenWali() { return dosenWali; }
    public Kendaraan getKendaraan() { return kendaraan; }
    
    /************************MUTATOR**************************/
    public void setNIM(String NIM) { this.NIM = NIM; }
    public void setNama(String Nama) { this.Nama = Nama; }
    public void setProdi(String Prodi) { this.Prodi = Prodi; }
    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }
    
    /*********************METHOD LAIN*************************/
    // Menambah mata kuliah (maks 50)
    public void addMatkul(MataKuliah mk)
    {
        if (listMatkul.size() < 50)
        {
            listMatkul.add(mk);
        }
    }

    // Menghitung jumlah mata kuliah yang diambil
    public int getJumlahMatKul()
    {
        return listMatkul.size();
    }

    // Menghitung total SKS dari semua mata kuliah
    public int getJumlahSKS()
    {
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++)
        {
            totalSKS += listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    // Mencetak detail mahasiswa beserta relasi
    public void printDetailMhs()
    {
        System.out.println("=== Detail Mahasiswa ===");
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + Nama);
        System.out.println("Prodi : " + Prodi);

        if (dosenWali != null)
        {
            System.out.println("Dosen Wali : " + dosenWali.getNama() + " (" + dosenWali.getNIP() + ")");
        }

        if (kendaraan != null)
        {
            System.out.println("Kendaraan  : " + kendaraan.jenis() + " - " + kendaraan.noPlat());
        } else {
            System.out.println("Kendaraan  : Tidak ada");
        }

        System.out.println("Jumlah Mata Kuliah : " + getJumlahMatKul());
        System.out.println("Jumlah SKS         : " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah :");
        for (int i = 0; i < listMatkul.size(); i++)
        {
            System.out.println("  " + (i + 1) + ". " + listMatkul.get(i).getMatkul() + " (" + listMatkul.get(i).getSKS() + " SKS)");
        }
    }
}
