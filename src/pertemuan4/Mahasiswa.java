package pertemuan4;

public class Mahasiswa {
    String nama;
    int nim;
    
    // Constructor
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}