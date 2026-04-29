/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 28 April 2026
 * File       : MainAnabul.java
 * Deskripsi  : Anabul - polimorfisme universal inclusion
 */

class Anabul {
    protected String nama;
    public Anabul(String nama) { this.nama = nama; }
    public void gerak() { System.out.println(nama + " bergerak."); }
    public void bersuara() { System.out.println(nama + " bersuara."); }
}

class Kucing extends Anabul {
    public Kucing(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan melata."); }
    @Override
    public void bersuara() { System.out.println(nama + " berbunyi nyaaaa~."); }
}

class Anjing extends Anabul {
    public Anjing(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan melata."); }
    @Override
    public void bersuara() { System.out.println(nama + " bersuara guk-guk."); }
}

class Burung extends Anabul {
    public Burung(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " bergerak dengan terbang."); }
    @Override
    public void bersuara() { System.out.println(nama + " berbunyi cuit."); }
}

public class MainAnabul {
    public static void main(String[] args) {
        Anabul peliharaan1 = new Kucing("Pepeng");
        Anabul peliharaan2 = new Anjing("Hachiko");
        Anabul peliharaan3 = new Burung("Icikiwir");

        peliharaan1.gerak(); peliharaan1.bersuara();
        peliharaan2.gerak(); peliharaan2.bersuara();
        peliharaan3.gerak(); peliharaan3.bersuara();
    }
}