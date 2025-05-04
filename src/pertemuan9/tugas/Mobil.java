package pertemuan9.tugas;

public class Mobil extends Kendaraan{

	private String warna;
	
	public Mobil(String warna, String merk, String jenis) {
		super(merk, jenis);
		setWarna(warna);
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}
}