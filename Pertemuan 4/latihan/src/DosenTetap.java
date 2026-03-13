import java.time.*;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String Fakultas, String NIDN){
        super(NIP, Nama, tglLahir, tmt, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    private LocalDate tglPensiun(){
        LocalDate pensiun = tglLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    private double Tunjangan(){
        int tahun = MasaKerja().getYears();
        return 0.02*tahun* gajiPokok;
    }

    public void printInfo(){
        Period masaKerja = MasaKerja();

        System.out.println("NIP : "+NIP);
        System.out.println("NIDN : "+NIDN);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + formTgl(tglLahir));
        System.out.println("TMT : "+formTgl(tmt));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + Fakultas);
        System.out.println("Masa Kerja :" + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan ");
        System.out.println("Tanggal Pensiun : "+ formTgl(tglPensiun()));
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunjangan : Rp"+ Tunjangan());
    }
}
