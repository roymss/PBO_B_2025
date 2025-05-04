package pertemuan6;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class TranskripNilai
{
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa)
    {
        super();
        this.mahasiswa = mahasiswa;

        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK()
    {
        // Bagaimana hitung IPK?
        // Rumus: (index nilai * sks) + ... + (index nilai * sks) / total_sks
    }

    public void addKHS(KartuHasilStudi khs)
    {
        kartuHasilStudi.add(khs);
    }

    public void display()
    {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi)
        {
            System.out.println(khs.display());
        }
    }

    /* Setter & Getter */
}
