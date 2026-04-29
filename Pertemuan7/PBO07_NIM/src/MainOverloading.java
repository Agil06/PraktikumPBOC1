/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : MainOverloading.java
 * Deskripsi  : Driver Main dari kelas mahasiswa
 */

public class MainOverloading {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); 
        Mahasiswa m2 = new Mahasiswa(120045, "Agil Yudis Wibawa", "Informatika"); 
        Mahasiswa m3 = new Mahasiswa(m2); 

        System.out.println("Data Awal");
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        System.out.println("\nUji setProgramStudi");
        m1.setProgramStudi();
        m1.tampilData();

        m1.setProgramStudi("Sistem Informasi");
        m1.tampilData();

        m3.setProgramStudi(m1);
        m3.tampilData();
    }
}