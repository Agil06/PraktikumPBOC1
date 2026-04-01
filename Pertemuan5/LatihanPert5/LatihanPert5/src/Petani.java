/* 
  Nama File : Petani.java
  Deskripsi : Kelas Petani merupakan subclass dari kelas Manusia dan mengimplementasi interface Pajak.
  Pembuat   : Agil Yudis Wibawa (24060124120045)
  Tanggal   : 02 April 2026
*/

import java.util.Date;
import java.util.Calendar;

public class Petani extends Manusia implements Pajak {
  private String asal_daerah;
  private static int counterPetani = 0;

  // Konstruktor tanpa parameter
  public Petani() {
    this.asal_daerah = "Belum diisi";
    counterPetani++;
  }

  // Konstruktor dengan parameter
  public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_daerah) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.asal_daerah = asal_daerah;
    counterPetani++;
  }

  @Override
  public double hitungPajak() {
    return 0; // tidak ada pajak untuk petani
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    // Add C (C = 5, diambil dari digit NIM ke-12)
    return years + 5;
  }

  @Override
  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("Asal Daerah: " + asal_daerah);
  }

  // Getters and setters
  public String getAsalDaerah() {
    return asal_daerah;
  }

  public void setAsalDaerah(String asal) {
    this.asal_daerah = asal;
  }

  public static int getCounterPetani() {
    return counterPetani;
  }
}