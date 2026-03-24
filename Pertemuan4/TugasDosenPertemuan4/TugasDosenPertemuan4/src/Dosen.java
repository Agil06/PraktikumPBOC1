/*
   Nama File    : Dosen.java
   Deskripsi    : Kelas anak dari Pegawai, (masih abstrak) inherit semua dengan tambahan 'fakultas' beserta mutator dan selektornya
   Pembuat      : Agil Yudis Wibawa (24060124120045)
   Tanggal      : 22 Maret 2026
*/

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
	/*************************ATRIBUT*************************/
	protected String fakultas;

	/*************************KONSTRUKTOR*************************/
	public Dosen() {
		super();
	}

	public Dosen(
		String NIP,
		String nama,
		LocalDate tanggalLahir,
		LocalDate TMT,
		double gajiPokok,
		String fakultas
	) {
		super(NIP, nama, tanggalLahir, TMT, gajiPokok);
		this.fakultas = fakultas;
	}
	/*************************SELEKTOR*************************/
	public String getFakultas() {
		return fakultas;
	}

	/*************************MUTATOR*************************/
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
}
