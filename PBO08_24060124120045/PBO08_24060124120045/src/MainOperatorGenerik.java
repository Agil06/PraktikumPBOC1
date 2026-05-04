/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026
 * File       : MainOperatorGenerik.java
 * Deskripsi  : Driver class untuk OperatorGenerik
 */

public class MainOperatorGenerik {
    /**********METHOD*******************/
    //MAIN METHOD
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        System.out.println("tukar sesama integer");
        op.Tukar(3, 6);

        System.out.println("\n tukar sesama string");
        op.Tukar("Agil", "Yudis");

        System.out.println("\n tukar keluarga anabul");
        Anabul anjing = new Anjing("Hachiko");
        Anabul kucing = new Kucing("Miko");
        op.Tukar(anjing, kucing);

        System.out.println("\n menghitung total bobot2");
        Anggora anggora = new Anggora("Snowy");
        anggora.bobot = 3.5;
        
        Kembangtelon kembangtelon = new Kembangtelon("Belang");
        kembangtelon.bobot = 4.2;

        double totalBobot = op.Bobot2(anggora, kembangtelon);
        System.out.println("Total bobot " + anggora.nama + " dan " + kembangtelon.nama + " adalah: " + totalBobot + " kg.");
    }
}
