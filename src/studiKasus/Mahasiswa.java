package studiKasus;

public class Mahasiswa
{
    private String NRP;
    private String nama;

    public Mahasiswa()
    {
        // TODO Auto-generated constructor stub
    }

    public Mahasiswa(String NRP, String nama) {
        this.NRP = NRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    // Getter & Setter
    public String getNrp() {
        return NRP;
    }

    public void setNrp(String nrp) {
        this.NRP = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}