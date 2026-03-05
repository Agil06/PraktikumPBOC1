/* Nama File    : Garis.java
   Deskripsi    : berisi atribut dan method dalam class Garis
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 8:25 3/5/2026 */

public class Garis {
    /*************************ATRIBUT*************************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************************METHOD*************************/
    // konstruktor tanpa parameter: (0,0) ke (1,1)
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // konstruktor dengan parameter titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // selektor dan mutator titikAwal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // selektor dan mutator titikAkhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // selektor untuk counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // mendapatkan gradien garis (m)
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            throw new ArithmeticException("Gradien tidak terdefinisi untuk garis vertikal");
        }
        return dy / dx;
    }

    // mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2.0;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2.0;
        return new Titik(xTengah, yTengah);
    }

    // cek sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // cek tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir
    public void printGaris() {
        System.out.println("Garis dari " + titikAwal + " ke " + titikAkhir);
    }

    // menampilkan persamaan garis y = mx + c dalam bentuk string
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
