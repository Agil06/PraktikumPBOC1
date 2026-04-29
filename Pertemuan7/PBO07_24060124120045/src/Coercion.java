/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : Coercion.java
 * Deskripsi  : Implementasi Polimorfisme Casting "Ad Hoc Coercion". Pengubahan data primitif
 */

public class Coercion {
    public static void main(String[] args) {
        int nilaiInt = 67;
        char nilaiChar = (char) nilaiInt;
        double valDouble = (double) nilaiInt;
        System.out.println("Nilai integer: " + nilaiInt);
        System.out.println("Nilai karakter: " + nilaiChar);
        System.out.println("Nilai real: " + valDouble);

        int nilaiAwal = 69;
        double nilaiReal = (double) nilaiAwal;
        int nilaiKembali = (int) nilaiReal;
        System.out.println("Awal: " + nilaiAwal + " | Menjadi Real: " + nilaiReal + " | Kembali Integer: " + nilaiKembali);

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("String S (Konkatenasi): " + S);
        System.out.println("Integer Z (Penjumlahan): " + Z);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("String R (Konkatenasi): " + R);
        System.out.println("Double D (Penjumlahan): " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("Integer A: " + A);

        String T = A.toString();
        System.out.println("String T: " + T);
    }
}