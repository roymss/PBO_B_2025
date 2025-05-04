package pertemuan6;

import pertemuan5.MataKuliah;
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

    public String display()
    {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah)
        {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS()
    {
        // ??
    }
}
