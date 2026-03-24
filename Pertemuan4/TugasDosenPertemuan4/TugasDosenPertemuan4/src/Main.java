/*
   Nama File    : Main.java
   Deskripsi    : Aplikasi untuk semua method
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 22 Maret 2026
*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548",
            "Andi",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5_000_000,
            "Fakultas Sains dan Matematika",
            "78647324"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "1122334455",
            "Budi",
            LocalDate.of(1988, 8, 20),
            LocalDate.of(2022, 9, 1),
            4_500_000,
            "Fakultas Teknik",
            "99887766",
            LocalDate.of(2026, 8, 31)
        );

        Tendik tendik = new Tendik(
            "6677889900",
            "Citra",
            LocalDate.of(1992, 2, 15),
            LocalDate.of(2018, 3, 1),
            4_000_000,
            Tendik.Bidang.AKADEMIK
        );

        dosenTetap.printInfo();
        System.out.println();

        dosenTamu.printInfo();
        System.out.println();

        tendik.printInfo();
        System.out.println();

        Pegawai.printCounterPegawai();
    }
}
