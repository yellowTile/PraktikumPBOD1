import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    public String NPWP;
    public static int counterPengusaha;

    public Pengusaha(String nama, LocalDate tgl_Mulai, String alamat, double pendapatan, String NPWP){
        super(nama, tgl_Mulai, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public String getNPWP(){
        return NPWP;
    }
    public void setNIP(String NPWP){
        this.NPWP = NPWP;
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate skrg = LocalDate.now();
        Period selisih = Period.between(tgl_Mulai, skrg);
        int bulanKerja = selisih.getYears()*12 + selisih.getMonths();
        
        return bulanKerja + 9;
    }

    public double hitungPajak(){
        return this.pendapatan * 15/100;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + NPWP);
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
}
