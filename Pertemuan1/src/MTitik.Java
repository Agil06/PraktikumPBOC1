/* 
   Nama File    : MTitik.Java
   Deskripsi    : Driver Titik yang berisi aplikasi tiap method pada kelas Titik.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 02/03/2026 
*/

public class MTitik 
{
    public static void main(String[] args) 
    {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik();

        T1.setAbsis(3);   // mengubah absis T1 menjadi 3
        T1.setOrdinat(4); // mengubah ordinat T1 menjadi 4
        T1.printTitik();  // mencetak koordinat T1

        T1.geser(3, 4);   // menggeser T1 sejauh (3,4)
        T1.printTitik();   // mencetak koordinat T1 setelah digeser
    }
}