/*
   Nama File    : Tendik.java
   Deskripsi    : Kelas anak dari Pegawai, (masih abstrak) inherit semua dengan tambahan 'Bidang' beserta mutator dan selektornya
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 22 Maret 2026
*/

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /*************************ATRIBUT*************************/
    public enum Bidang {
        AKADEMIK,
        KEMAHASISWAAN,
        SUMBER_DAYA
    }

    private Bidang bidang;
    private static final int BUP = 55;

    /*************************KONSTRUKTOR*************************/
    public Tendik(
        String NIP,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        double gajiPokok,
        Bidang bidang
    ) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    /*************************SELEKTOR*************************/
    public Bidang getBidang() {
        return bidang;
    }

    public LocalDate getTanggalPensiun() {
        return hitungTanggalPensiun(BUP);
    }

    /*************************MUTATOR*************************/
    public void setBidang(Bidang bidang) {
        this.bidang = bidang;
    }

    /*************************METHOD TAMBAHAN*************************/
    @Override
    public double hitungTunjangan() {
        return 0.01 * getMasaKerjaDalamTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Tendik ===");
        System.out.println("NIP            : " + NIP);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Bidang         : " + bidang);
        System.out.println("TMT            : " + TMT);
        System.out.println("Masa Kerja     : " + getMasaKerjaDalamTahun() + " tahun");
        System.out.println("BUP            : " + BUP + " tahun");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun());
        System.out.println("Gaji Pokok     : " + gajiPokok);
        System.out.println("Tunjangan      : " + hitungTunjangan());
        System.out.println("Gaji Total     : " + hitungGajiTotal());
    }
}
