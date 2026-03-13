import java.time.LocalDate;

public class Dosen extends Pegawai{
    protected String Fakultas;

    public Dosen(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String Fakultas){
        super(NIP, Nama, tglLahir, tmt, gajiPokok);
        this.Fakultas = Fakultas;
    }
}
