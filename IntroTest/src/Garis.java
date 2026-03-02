// Nama File   : Garis.java
// Deskripsi   : berisi atribut dan method dalam class Garis
// Pembuat     : Zulfa Nabilah
// Tanggal     : 2 Maret 2026


public class Garis {
    private Titik awal;
    private Titik akhir;
    private static int counterGaris;

    public Garis(){
        awal = new Titik(0,0);
        akhir = new Titik(1,1);
        counterGaris++;
    }
    public Garis (Titik T1, Titik T2){
        this.awal = T1;
        this.akhir = T2;
        counterGaris++;
    }
    public Titik getAwal(){
        return awal;
    }
    public Titik getAkhir(){
        return akhir;
    }
    public void setAwal(Titik T){
        this.awal = T;
    }
    public void setAkhir(Titik T){
        this.akhir = T;
    }
    public static int getCounterGaris(){
        return counterGaris;
    }
    public double panjang(){
        return Math.sqrt(   Math.pow((awal.getOrdinat() - akhir.getOrdinat()), 2) + 
                            Math.pow((awal.getAbsis() - akhir.getAbsis()), 2));
    }
    public double gradien(){
        if (isVertikal()) {
            return 0; //tak terdefinisi sbnrnya
        } 
        return (akhir.getOrdinat() - awal.getOrdinat()) /
               (akhir.getAbsis() - awal.getAbsis());
    }
    public Titik titikTengah(){
        Titik T = new Titik();
        T.setAbsis((awal.getAbsis() + akhir.getAbsis()) / 2);
        T.setOrdinat((awal.getOrdinat() + akhir.getOrdinat()) / 2);
        return T;
    }
    public boolean isVertikal(){
        return awal.getAbsis() == akhir.getAbsis();
    }
    public boolean isHorizontal(){
        return awal.getOrdinat() == akhir.getOrdinat();
    }

    public boolean sejajarDengan(Garis G){
        if(this.isVertikal() && G.isVertikal()){
            return true;
        }
        if(this.isHorizontal() && G.isHorizontal()){
            return true;
        } 
        if(!this.isVertikal() && !G.isVertikal()){
            return this.gradien() == G.gradien();
        } 
        return false;
    
    }
    public boolean tegakLurus(Garis G){
        if((this.isVertikal() && G.isHorizontal()) || (this.isHorizontal() && G.isVertikal())){
            return true;
        }else if((this.isVertikal() && G.isVertikal()) || (this.isHorizontal() && G.isHorizontal())){
            return false;
        }else if(!this.isVertikal() && !G.isVertikal()){
            return this.gradien() * G.gradien() == -1;
        }else{
            return false;
        }
        
    }

    public void printGaris(){
        System.out.println("Titik awal: (" + awal.getAbsis() + ", " + awal.getOrdinat() + ")");
        System.out.println("Titik akhir: (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    public String persamaanGaris(){
        if(isVertikal()){
            return "x = " + awal.getAbsis();
        }
        if(isHorizontal()){
            return "y = " + awal.getOrdinat();
        }
        double m = gradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        String tanda = c >= 0 ? " + " : " - ";
        double c_abs = Math.abs(c);
        return "y = " + m + "x" + tanda + c_abs;
    }
}

