package Pertemuan3.KelasDanObjek;

public class Lingkaran {

	double jari;
	double phi;
	
	public Lingkaran(float jari) {
		this.jari = jari;
		this.phi = 3.14;
	}
	
	public double hitungLuas() {
		return phi * jari * jari;
	}
}
