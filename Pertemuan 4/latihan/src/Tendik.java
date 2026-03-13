import java.time.*;

public class Tendik extends Pegawai{
    private String bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(NIP, Nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    private LocalDate tglPensiun(){
        LocalDate pensiun = tglLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    private double Tunjangan(){
        int tahun = MasaKerja().getYears();
        return 0.01 * tahun * gajiPokok;
    }

    public void printInfo(){
        Period masaKerja = MasaKerja();

        System.out.println("NIP : "+NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + formTgl(tglLahir));
        System.out.println("TMT : "+formTgl(tmt));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja :" + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan ");
        System.out.println("Tanggal Pensiun : "+ formTgl(tglPensiun()));
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunjangan : Rp"+ Tunjangan());
    }
}
