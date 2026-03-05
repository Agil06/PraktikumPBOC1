/* Nama File    : Titik.java
   Deskripsi    : berisi atribut dan method dalam class Titik
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 4:28 PM 2/26/2026 */

    public class Titik {
     /*************************ATRIBUT*************************/
     private double absis;
     private double ordinat;
     private static int counterTitik = 0;
    
    /*************************METHOD*************************/
    // konstruktor titik tanpa parameter (menghasilkan titik (0,0))
    public Titik(){
        this(0, 0);
    }

    // konstruktor titik dengan parameter absis dan ordinat
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }
    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }
    
    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }
    
    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }
    
    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    // mencetak koordinat titik
    public void PrintTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }

    // mengembalikan kuadran titik
    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        return 0;
    }

    // mengembalikan jarak titik dari pusat koordinat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // mengembalikan jarak titik dari titik lain T
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow((T.absis - this.absis), 2) + Math.pow((T.ordinat - this.ordinat), 2));
    }

    // merefleksikan titik terhadap sumbu X (mengubah nilai ordinat)
    public void refleksiX(){
        this.ordinat = this.ordinat * -1;
    }

    // merefleksikan titik terhadap sumbu Y (mengubah nilai absis)
    public void refleksiY(){
        this.absis = this.absis * -1;
    }

    // mengembalikan titik baru hasil refleksi terhadap sumbu X
    public Titik getRefleksiX(){
        Titik T = new Titik(this.absis, this.ordinat * -1);
        return T;
    }

    // mengembalikan titik baru hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY(){
        Titik T = new Titik(this.absis * -1, this.ordinat);
        return T;
    }

    @Override
    public String toString(){
        return "(" + this.absis + ", " + this.ordinat + ")";
    }
}