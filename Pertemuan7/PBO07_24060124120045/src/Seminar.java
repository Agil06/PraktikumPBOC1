/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Seminar.java
 * Deskripsi  : Implementasi Polimorfisme Universal Inclusion
 */

abstract class CivitasAkademika {
    protected String nama;
    public CivitasAkademika(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    public abstract String getNomor();
}

class Dosen extends CivitasAkademika {
    private String nip;
    public Dosen(String nip, String nama) { 
        super(nama); 
        this.nip = nip; 
    }
    @Override
    public String getNomor() { return nip; }
}

class MahasiswaSeminar extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;
    public MahasiswaSeminar(String nim, String nama) { 
        super(nama); 
        this.nim = nim; 
    }
    @Override
    public String getNomor() { return nim; }
    
    
    public void setWali(Dosen d) { this.dosenWali = d; }
    
    
    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Belum ditentukan";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}

class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    
    public int countPeserta() { return banyakPeserta; }
    
    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas seminar penuh");
        }
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i+1) + ". Nomor: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }
}