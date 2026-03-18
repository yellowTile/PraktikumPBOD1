import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    public String asal_kota;
    public static int counterPetani;

    public Petani(String nama, LocalDate tgl_Mulai, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_Mulai, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getasal_kota(){
        return asal_kota;
    }
    public void setNIP(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate skrg = LocalDate.now();
        Period selisih = Period.between(tgl_Mulai, skrg);
        int bulanKerja = selisih.getYears()*12 + selisih.getMonths();
        
        return bulanKerja + 0;
    }

    public double hitungPajak(){
        return this.pendapatan * 0;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("asal kota : " + asal_kota);
    }

    public static int getCounterPetani(){
        return counterPetani;
    }
}
