// Nama        : Titik.java
// Deskripsi   : berisi atribut dan method dalam class Titik
// Pembuat     : Agil Yudis Wibawa 24060124120045
// Tanggal     : 1:42 PM 3/2/2026

public class Titik {
    /************ATRIBUT************/
    double absis;
    double ordinat;

    /************METHOD************/
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }
    
    // mengembalikan nilai ordinat

    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}