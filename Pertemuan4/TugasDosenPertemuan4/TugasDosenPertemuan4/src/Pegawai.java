/*
   Nama File    : Pegawai.java
   Deskripsi    : Kelas abstrak induk untuk semua jenis pegawai
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 22 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public abstract class Pegawai {
    /*************************ATRIBUT*************************/
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    private static int counterPegawai = 0;

    /*************************KONSTRUKTOR*************************/
    public Pegawai() {
        counterPegawai++;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    /*************************SELEKTOR*************************/
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public static int getCounterPegawai() {
        return counterPegawai;
    }

    /*************************MUTATOR*************************/
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /*************************METHOD TAMBAHAN*************************/
    public int getMasaKerjaDalamTahun() {
        if (TMT == null) {
            return 0;
        }

        LocalDate sekarang = LocalDate.now();
        if (TMT.isAfter(sekarang)) {
            return 0;
        }

        return Period.between(TMT, sekarang).getYears();
    }

    protected LocalDate hitungTanggalPensiun(int BUP) {
        LocalDate tanggalBUP = tanggalLahir.plusYears(BUP);
        return tanggalBUP.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungTunjangan();
    }

    public static void printCounterPegawai() {
        System.out.println("Jumlah objek pegawai: " + counterPegawai);
    }

    public abstract double hitungTunjangan();

    public abstract void printInfo();
}