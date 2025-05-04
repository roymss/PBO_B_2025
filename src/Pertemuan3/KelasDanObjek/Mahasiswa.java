package Pertemuan3.KelasDanObjek;

public class Mahasiswa {
	
	    String nim;
	    String nama;
	    String alamat;
	    boolean hadir;

	    // Konstruktor
	    public Mahasiswa(String nim, String nama, String alamat) {
	        this.nim = nim;
	        this.nama = nama;
	        this.alamat = alamat;
	        this.hadir = false; // Awalnya tidak hadir
	    }

	    // Method untuk masuk kelas
	    public void masukKelas() {
	        this.hadir = true;
	    }
	}