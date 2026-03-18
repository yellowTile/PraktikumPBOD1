import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    public String NIP;
    public static int counterPNS;

    public PNS(String nama, LocalDate tgl_Mulai, String alamat, double pendapatan, String NIP){
        super(nama, tgl_Mulai, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public String getNIP(){
        return NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate skrg = LocalDate.now();
        Period selisih = Period.between(tgl_Mulai, skrg);
        int bulanKerja = selisih.getYears()*12 + selisih.getMonths();
        
        return bulanKerja + 5;
    }

    public double hitungPajak(){
        return this.pendapatan * 10/100;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP : " + NIP);
    }

    public static int getCounterPNS(){
        return counterPNS;
    }
}
