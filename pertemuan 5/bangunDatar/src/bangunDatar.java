// Nama file : Pertemuan 5
// deskripsi : bersisi tentang abstract class dan interface
// Nama : Zulfa Nabilah 
// NIM 24060124130095
// tanggal : 17 Maret 2025


// bagian 1
public abstract class bangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public bangunDatar(){
    }

    public bangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }


//  bagian 1 nomor 4
    public boolean isEquals(bangunDatar X){
        return this.getLuas() == X.getLuas();
    }

//  bagian 1 nomor 2
    public abstract double getLuas();

    public abstract double getKeliling();

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

