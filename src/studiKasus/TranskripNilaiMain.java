package studiKasus;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Fajar Darmawan, ST., M.KOM.", "001");
        Dosen d2 = new Dosen("Dr. Ir. Leony Lidya, ST., MT.", "002");
        Dosen d3 = new Dosen("Siroj Nur Ulum, ST., M.T.", "003");

        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, d1);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "A", 3, d2);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "A", 3, d3);

        KartuHasilStudi khs = new KartuHasilStudi("4");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);

        transkrip.hitungIPK();
        transkrip.display(true); 
    }
}
