/**
 * NIM     : 24060124120045
 * Nama    : Agil Yudis Wibawa
 * Tanggal : 7 Mei 2026
 * File    : Piaraan.java
*/
import java.util.*;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() { return this.nbelm; }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) { 
        return Lanabul.contains(anabul); 
    }

    public Anabul getAnabul() {
        if (Lanabul.isEmpty()) return null;
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        if (Lanabul.isEmpty()) return null;
        nbelm--;
        return Lanabul.poll();
    }

    public void showAnabul() {
        System.out.println("Daftar Panggilan Anabul dalam Antrean:");
        for (Anabul anabul : Lanabul) {
            String p = anabul.getPanggilan();
            System.out.println("- " + (p != null ? p : anabul.getNama()));
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) count++;
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Panggilan dan Jenis Anabul dalam Antrean:");
        for (Anabul anabul : Lanabul) {
            String p = anabul.getPanggilan();
            String name = (p != null ? p : anabul.getNama());
            System.out.println("- " + name + " (" + anabul.getClass().getSimpleName() + ")");
        }
    }
}