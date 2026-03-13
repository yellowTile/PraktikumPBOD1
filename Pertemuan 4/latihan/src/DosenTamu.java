import java.time.*;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate akhirKontraK;

    public DosenTamu(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String Fakultas, String NIDK, LocalDate akhirKontraK){
        super(NIP, Nama, tglLahir, tmt, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.akhirKontraK = akhirKontraK;
    }

    private double Tunjangan(){
        return 0.025*gajiPokok;
    }

    public void printInfo(){
        Period masaKerja = MasaKerja();
        Period sisaKontrak = Period.between(LocalDate.now(), akhirKontraK);

         System.out.println("NIP : "+NIP);
        System.out.println("NIDK : "+NIDK);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + formTgl(tglLahir));
        System.out.println("TMT : "+formTgl(tmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + Fakultas);
        System.out.println("Masa Kerja :" + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan ");
        System.out.println("Sisa Kontrak : " + sisaKontrak.getYears() + " tahun " + sisaKontrak.getMonths() + " bulan ");
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunjangan : Rp" + Tunjangan());

    }
}
