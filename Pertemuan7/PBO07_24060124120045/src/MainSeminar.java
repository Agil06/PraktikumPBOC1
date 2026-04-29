/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : MainSeminar.java
 * Deskripsi  : driver Seminar
 */

public class MainSeminar {
    public static void main(String[] args) {
        Seminar sem = new Seminar();

        Dosen d1 = new Dosen("NIP001", "Dr. Herri");
        Dosen d2 = new Dosen("NIP002", "Prof. Agil");

        MahasiswaSeminar m1 = new MahasiswaSeminar("101", "Caca");
        MahasiswaSeminar m2 = new MahasiswaSeminar("102", "Dodi");
        MahasiswaSeminar m3 = new MahasiswaSeminar("103", "Eka");
        MahasiswaSeminar m4 = new MahasiswaSeminar("104", "Fani");
        MahasiswaSeminar m5 = new MahasiswaSeminar("105", "Gita");

        m1.setWali(d1); m2.setWali(d1);
        m3.setWali(d2); m4.setWali(d2); m5.setWali(d2);

        sem.registrasi(d1); sem.registrasi(d2);
        sem.registrasi(m1); sem.registrasi(m2);
        sem.registrasi(m3); sem.registrasi(m4); sem.registrasi(m5);

        System.out.println("Total Peserta Seminar: " + sem.countPeserta());
        System.out.println("Total Mahasiswa Seminar: " + sem.countMahasiswa());
        
        System.out.println();
        sem.tampilPeserta();

        m1.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}