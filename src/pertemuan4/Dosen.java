package pertemuan4;

public class Dosen {
    String nama;
    String nip;
    
    // Constructor
    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("NIP: " + nip);
    }
}