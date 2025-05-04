package pertemuan9.tugas;

public class Kendaraan {

	protected String merk;
	protected String jenis;
	
	public Kendaraan(String merk, String jenis) {
		this.merk = merk;
		this.jenis = jenis;
	}

	public String getMerk() {
		return merk;
	}
	
	public String getJenis() {
		return jenis;
	}
}