package studiKasus;

public class MataKuliah
{
	private String kode;
    private String nama;
    private String index; // nilai dalam bentuk huruf (A, AB, dll)
    private int sks;
    private Dosen dosenPengampu;

    /* Konstruktor */
    public MataKuliah(String kode, String nama, String index, int sks, Dosen dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public double nilaiIndex()
    {

        switch (index) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return -1; 
        }
    }
    
    public int getSks() {
        return sks;
    }

    public String display(boolean tampilkanDosen) {
        String result = "Kode: " + kode + ", Nama: " + nama + ", Nilai: " + index + ", SKS: " + sks;
        if (tampilkanDosen && dosenPengampu != null) {
            result += "\n" + dosenPengampu.display();
        }
        return result;
    }
}