/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026
 * File       : MainDatum.java
 * Deskripsi  : Implementasi & ilustrasi kelas generik datum
 */

public class MainDatum {
    /**********METHOD*******************/
    //MAIN METHOD
    public static void main(String[] args) {
        // Membuat objek dari keluarga anabul (anggora, kembangtelon, anjing, burung, kucing)
        Anggora kucingAnggora = new Anggora("Snowy");
        Kembangtelon kucingKembangtelon = new Kembangtelon("Belang");
        Anjing anjingList = new Anjing("Hachiko");

        // Menggunakan kelas generic datum untuk objek anggora
        Datum<Anggora> datumAnggora = new Datum<>();
        datumAnggora.setIsi(kucingAnggora);
        
        System.out.println("Isi datumAnggora: " + datumAnggora.getIsi().getClass().getSimpleName());
        datumAnggora.getIsi().bersuara();

        // Menggunakan kelas generic datum untuk objek kembangtelon
        Datum<Kembangtelon> datumKembangtelon = new Datum<>();
        datumKembangtelon.setIsi(kucingKembangtelon);
        
        System.out.println("Isi datum kembangtelon: " + datumKembangtelon.getIsi().getClass().getSimpleName());
        datumKembangtelon.getIsi().gerak();

        // Menggunakan kelas generic datum untuk level anabul
        Datum<Anabul> datumAnabul = new Datum<>();
        datumAnabul.setIsi(anjingList);
        
        System.out.println("Isi datumAnabul: " + datumAnabul.getIsi().getClass().getSimpleName());
        datumAnabul.getIsi().bersuara();
    }
}
