import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public Period MasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    public String formTgl(LocalDate tgl){
        String bulan = tgl.getMonth().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
        return tgl.getDayOfMonth() + " " + bulan + " " + tgl.getYear();
    }
}
