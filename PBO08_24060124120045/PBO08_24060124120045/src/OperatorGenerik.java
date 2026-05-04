/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 3 Mei 2026
 * File       : OperatorGenerik.java
 * Deskripsi  : Implementasi operator generik
 */

public class OperatorGenerik {
    /**********METHOD*******************/
    //METHOD TAMBAHAN
    public <T> void Tukar(T a, T b) {
        System.out.println("masukan nilai: a=" + formatValue(a) + ", b=" + formatValue(b));
        T temp = a;
        a = b;
        b = temp;
        System.out.println("hasil penukaran: a=" + formatValue(a) + ", b=" + formatValue(b));
    }

    private <T> String formatValue(T value) {
        if (value instanceof Anabul) {
            return "objek " + value.getClass().getSimpleName();
        }
        return value.toString();
    }

    public <T1 extends Kucing, T2 extends Kucing> double Bobot2(T1 k1, T2 k2) {
        return k1.bobot + k2.bobot;
    }
}