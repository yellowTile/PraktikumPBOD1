// Nama : Zulfa Nabilah
// NIM : 240012413095
// nama file : perpajakan
// deskripsi : berisi abstract dan interface
// tanggal : 17 Maret 2025


import java.time.LocalDate;


public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_Mulai;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia(){

    }

    public Manusia(String nama, LocalDate tgl_Mulai, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_Mulai = tgl_Mulai;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama(){
        return nama;
    }
    public LocalDate gettgl_Mulai(){
        return tgl_Mulai;
    }
    public String getalamat(){
        return alamat;
    }
    public double getPendapatan(){
        return pendapatan;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void settgl_Mulai(LocalDate tgl_Mulai){
        this.tgl_Mulai = tgl_Mulai;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setpendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
    
    public void cetakInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("tgl_mulai_kerja : " + tgl_Mulai);
        System.out.println("alamat : " + alamat);
        System.out.println("pendapatan : " + pendapatan);
    }
    
    public abstract int hitungMasaKerja();

    public static int getCounterMns(){
        return counterMns;
    }
}


