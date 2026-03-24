/*
   Nama File    : DosenTetap.java
   Deskripsi    : Kelas anak dari Dosen, tidak abstrak, inherit semua dengan tambahan NIDN dan BUP beserta mutator dan selektornya.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 22 Maret 2026
*/

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /*************************ATRIBUT*************************/
    private String NIDN;
    private static final int BUP = 65;

    /*************************KONSTRUKTOR*************************/
    public DosenTetap(
        String NIP,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        double gajiPokok,
        String fakultas,
        String NIDN
    ) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    /*************************SELEKTOR*************************/
    public String getNIDN() {
        return NIDN;
    }

    public LocalDate getTanggalPensiun() {
        return hitungTanggalPensiun(BUP);
    }

    /*************************MUTATOR*************************/
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    /*************************METHOD TAMBAHAN*************************/
    @Override
    public double hitungTunjangan() {
        return 0.02 * getMasaKerjaDalamTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Dosen Tetap ===");
        System.out.println("NIP            : " + NIP);
        System.out.println("NIDN           : " + NIDN);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Fakultas       : " + fakultas);
        System.out.println("TMT            : " + TMT);
        System.out.println("Masa Kerja     : " + getMasaKerjaDalamTahun() + " tahun");
        System.out.println("BUP            : " + BUP + " tahun");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun());
        System.out.println("Gaji Pokok     : " + gajiPokok);
        System.out.println("Tunjangan      : " + hitungTunjangan());
        System.out.println("Gaji Total     : " + hitungGajiTotal());
    }
}
