package studiKasus;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0.0;
        int totalSks = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (MataKuliah mk : khs.getDaftarMataKuliah()) {
                double nilai = mk.nilaiIndex();
                int sks = mk.getSks();
                if (nilai >= 0) {
                    totalNilai += nilai * sks;
                    totalSks += sks;
                }
            }
        }

        if (totalSks > 0) {
            this.ipk = totalNilai / totalSks;
        } else {
            this.ipk = 0.0;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        khs.hitungIPS(); // pastikan IPS sudah dihitung sebelum ditambahkan
        kartuHasilStudi.add(khs);
    }

    public void display(boolean tampilkanDosen) {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.print(khs.display(tampilkanDosen));
        }
    }

    // Optional Getter & Setter
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }
}
