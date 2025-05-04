package studiKasus;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi
{
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester)
    {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah mataKuliah)
    {
        daftarMataKuliah.add(mataKuliah);
    }

    public void hitungIPS() {
        double totalNilai = 0.0;
        int totalSks = 0;

        for (MataKuliah mk : daftarMataKuliah) {
            double nilai = mk.nilaiIndex();
            int sks = mk.getSks();
            if (nilai >= 0) { // pastikan nilai valid
                totalNilai += nilai * sks;
                totalSks += sks;
            }
        }

        if (totalSks > 0) {
            this.ips = totalNilai / totalSks;
        } else {
            this.ips = 0.0;
        }
    }

    public String getSemester() {
        return semester;
    }

    public double getIPS() {
        return ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public String display(boolean tampilkanDosen) {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");

        for (MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display(tampilkanDosen)).append("\n");
        }

        sb.append(String.format("IPS: %.2f\n", ips));
        return sb.toString();
    }

}