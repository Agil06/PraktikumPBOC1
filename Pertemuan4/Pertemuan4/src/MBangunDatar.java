public class MBangunDatar {
    public static void main(String[] args) 
    {
        // ============ TEST LINGKARAN ============
        System.out.println("========== TEST LINGKARAN ==========");

        // Constructor default
        Lingkaran circle1 = new Lingkaran();
        System.out.println("--- Lingkaran default ---");
        System.out.println("Jari-jari: " + circle1.getJari());

        // Constructor berparameter
        Lingkaran circle2 = new Lingkaran(10, "Hijau", "Merah");
        System.out.println("\n--- Lingkaran berparameter ---");
        circle2.printInfo();

        // Test getter
        System.out.println("\n--- Test Getter Lingkaran ---");
        System.out.println("Jari-jari: " + circle2.getJari());
        System.out.println("Jumlah sisi: " + circle2.getJmlSisi());
        System.out.println("Warna: " + circle2.getWarna());
        System.out.println("Border: " + circle2.getBorder());

        // Test setter
        System.out.println("\n--- Test Setter Lingkaran ---");
        circle2.setJari(7.5);
        circle2.setWarna("Biru");
        circle2.setBorder("Kuning");
        System.out.println("Jari-jari baru: " + circle2.getJari());
        System.out.println("Warna baru: " + circle2.getWarna());
        System.out.println("Border baru: " + circle2.getBorder());

        // Test getLuas & getKeliling
        System.out.println("\n--- Test Luas & Keliling Lingkaran ---");
        System.out.println("Luas: " + circle2.getLuas());
        System.out.println("Keliling: " + circle2.getKeliling());

        // Test printInfo
        System.out.println("\n--- Test printInfo Lingkaran ---");
        circle2.printInfo();

        // Lingkaran ketiga untuk counter
        Lingkaran circle3 = new Lingkaran(9.7, "Ungu", "Pink");

        // ============ TEST PERSEGI ============
        System.out.println("\n========== TEST PERSEGI ==========");

        // Constructor default
        Persegi persegi1 = new Persegi();
        System.out.println("--- Persegi default ---");
        System.out.println("Sisi: " + persegi1.getSisi());

        // Constructor berparameter
        Persegi persegi2 = new Persegi(5, "Ungu", "Merah");
        System.out.println("\n--- Persegi berparameter ---");
        persegi2.printInfo();

        // Test getter
        System.out.println("\n--- Test Getter Persegi ---");
        System.out.println("Sisi: " + persegi2.getSisi());
        System.out.println("Jumlah sisi: " + persegi2.getJmlSisi());
        System.out.println("Warna: " + persegi2.getWarna());
        System.out.println("Border: " + persegi2.getBorder());

        // Test setter
        System.out.println("\n--- Test Setter Persegi ---");
        persegi2.setSisi(8);
        persegi2.setWarna("Kuning");
        persegi2.setBorder("Hitam");
        System.out.println("Sisi baru: " + persegi2.getSisi());
        System.out.println("Warna baru: " + persegi2.getWarna());
        System.out.println("Border baru: " + persegi2.getBorder());

        // Test getLuas, getKeliling, getDiagonal
        System.out.println("\n--- Test Luas, Keliling, Diagonal Persegi ---");
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("Diagonal: " + persegi2.getDiagonal());

        // Test printInfo
        System.out.println("\n--- Test printInfo Persegi ---");
        persegi2.printInfo();

        // Persegi ketiga untuk counter
        Persegi persegi3 = new Persegi(3, "Hijau", "Biru");

        // ============ TEST COUNTER ============
        System.out.println("\n========== TEST COUNTER ==========");
        BangunDatar.printCounterBangunDatar();
    }
}