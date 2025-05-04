package pertemuan4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", 233040116);
        
        // Membuat objek Dosen
        Dosen dsn1 = new Dosen("Dr. Andi Setiawan", "123456789");
        
        // Menampilkan informasi mahasiswa dan dosen
        mhs1.tampilkanInfo();
        System.out.println();
        dsn1.tampilkanInfo();
    }
}