/* 
   Nama File    : MMahasiswa.java
   Deskripsi    : Driver Mahasiswa yang berisi aplikasi tiap method pada kelas-kelas yang berkaitan.
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 05/03/2026 
*/

public class MMahasiswa 
{
    public static void main(String[] args) 
    {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("198501012010011001", "Dr. Budi Santoso", "Informatika");
        Dosen dosen2 = new Dosen("199002022015022002", "Dr. Siti Aminah", "Informatika");

        // Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", 3);
        MataKuliah mk2 = new MataKuliah("IF102", 4);
        MataKuliah mk3 = new MataKuliah("IF103", 3);

        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("H 1234 AB", "Motor");
        Kendaraan kendaraan2 = new Kendaraan("H 5678 CD", "Mobil");

        // Membuat objek Mahasiswa (relasi: 1 dosen wali wajib)
        Mahasiswa mhs1 = new Mahasiswa("24060122130001", "Agil", "Informatika", dosen1);
        mhs1.addMatkul(mk1);
        mhs1.addMatkul(mk2);
        mhs1.setKendaraan(kendaraan1); // punya 1 kendaraan

        Mahasiswa mhs2 = new Mahasiswa("24060122130002", "Budi", "Informatika", dosen2);
        mhs2.addMatkul(mk1);
        mhs2.addMatkul(mk2);
        mhs2.addMatkul(mk3);
        // mhs2 tidak punya kendaraan (0 kendaraan)

        // Memanggil method getJumlahSKS(), getJumlahMatKul(), printDetailMhs()
        System.out.println("Jumlah SKS mhs1    : " + mhs1.getJumlahSKS());
        System.out.println("Jumlah MatKul mhs1 : " + mhs1.getJumlahMatKul());
        System.out.println();
        mhs1.printDetailMhs();

        System.out.println();

        System.out.println("Jumlah SKS mhs2    : " + mhs2.getJumlahSKS());
        System.out.println("Jumlah MatKul mhs2 : " + mhs2.getJumlahMatKul());
        System.out.println();
        mhs2.printDetailMhs();
    }
}
