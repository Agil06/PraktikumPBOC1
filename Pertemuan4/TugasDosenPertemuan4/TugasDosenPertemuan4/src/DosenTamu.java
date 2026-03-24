/*
   Nama File    : DosenTamu.java
   Deskripsi    : Kelas anak dari Dosen, tidak abstrak, inherit semua dengan tambahan NIDK dan tanggalBerakhirKontrak beserta mutator dan selektornya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 22 Maret 2026
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /*************************ATRIBUT*************************/
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;

    /*************************KONSTRUKTOR*************************/
    public DosenTamu(
        String NIP,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        double gajiPokok,
        String fakultas,
        String NIDK,
        LocalDate tanggalBerakhirKontrak
    ) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    /*************************SELEKTOR*************************/
    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    /*************************MUTATOR*************************/
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    /*************************METHOD TAMBAHAN*************************/
    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Dosen Tamu ===");
        System.out.println("NIP                   : " + NIP);
        System.out.println("NIDK                  : " + NIDK);
        System.out.println("Nama                  : " + nama);
        System.out.println("Tanggal Lahir         : " + tanggalLahir);
        System.out.println("Fakultas              : " + fakultas);
        System.out.println("TMT                   : " + TMT);
        System.out.println("Tanggal Akhir Kontrak : " + tanggalBerakhirKontrak);
        System.out.println("Gaji Pokok            : " + gajiPokok);
        System.out.println("Tunjangan             : " + hitungTunjangan());
        System.out.println("Gaji Total            : " + hitungGajiTotal());
    }
}
