/**
 * Nama       : Agil Yudis Wibawa
 * NIM        : 24060124120045
 * Lab        : C1
 * Tanggal    : 9 April 2026
 * File       : Main.java
 * Deskripsi  : Driver
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("============== BAGIAN 1: Teman ==============");
        Teman temanAntre = new Teman();
        temanAntre.addNama("Agil");
        temanAntre.addNama("Yudis");
        temanAntre.addNama("Wibawa");

        System.out.println("Jumlah teman: " + temanAntre.getNbelm());
        temanAntre.showTeman();

        System.out.println("Apakah 'Agil' member? " + temanAntre.isMember("Agil"));
        temanAntre.gantiNama("Yudis", "Budi");
        temanAntre.showTeman();

        temanAntre.addNama("Agil");
        System.out.println("Jumlah 'Agil': " + temanAntre.countNama("Agil"));
        temanAntre.delNama("Agil");
        temanAntre.showTeman();


        System.out.println("\n============== BAGIAN 2: Piaraan ==============");
        Piaraan klinik = new Piaraan();
        
        Kucing kucing1 = new Kucing("Pepeng", 5.5);
        kucing1.setPanggilan("Peng");
        Anjing anjing1 = new Anjing("Bakpao");
        anjing1.setPanggilan("Pao");
        Anggora anggora1 = new Anggora("Michael");
        anggora1.setPanggilan("Miki");
        anggora1.setBobot(4.2);
        Burung burung1 = new Burung("KicauMania");
        burung1.setPanggilan("Kiman");
        Kembangtelon kembangtelon1 = new Kembangtelon("Gembrot");
        kembangtelon1.setPanggilan("Brot");
        kembangtelon1.setBobot(3.8);

        klinik.enqueueAnabul(kucing1);
        klinik.enqueueAnabul(anjing1);
        klinik.enqueueAnabul(anggora1);
        klinik.enqueueAnabul(burung1);
        klinik.enqueueAnabul(kembangtelon1);

        System.out.println("Jumlah antrean: " + klinik.getNbelm());
        klinik.showAnabul();
        
        System.out.println("Apakah anjing1 ada di antrean? " + klinik.isMember(anjing1));
        System.out.println("Jumlah kucing di antrean: " + klinik.countKucing());
        System.out.println("Total bobot kucing di antrean: " + klinik.bobotKucing());
        
        klinik.showJenisAnabul();

        System.out.println("\nProses Dequeue...");
        Anabul dilayani = klinik.dequeueAnabul();
        System.out.println("Dilayani: " + dilayani.getPanggilan());
        klinik.showJenisAnabul();
    }
}