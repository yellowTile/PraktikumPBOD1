// Nama File   : Titik.java
// Deskripsi   : berisi atribut dan method dalam class Titik
// Pembuat     : Zulfa Nabilah
// Tanggal     : 26 Februari 2026



public class Titik {
    
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public Titik(){
        this(0,0);
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printcounterTitik(){
        System.out.println(this.counterTitik);
        // dapet peringatan
    }

    public int getKuadran(){
        if(this.absis > 0 && this.ordinat > 0){
            return 1;
        }else if(this.absis < 0 && this.ordinat > 0){
            return 2;
        }else if(this.absis < 0 && this.ordinat < 0){
            return 3;
        }else if(this.absis > 0 && this.ordinat < 0){
            return 4;
        }else{
            return -1;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    public double getJarak(Titik T){
        return Math.sqrt(Math.pow((this.absis - T.getAbsis()), 2) + Math.pow((this.ordinat - T.getOrdinat()), 2));
    }

    public void refleksiX(){
        ordinat = ordinat * (-1);
    }

    public void refleksiY(){
        absis = absis * (-1);
    }

    public Titik getRefleksiX(){
        Titik T = new Titik();
        T.setAbsis(this.absis);
        T.setOrdinat(this.ordinat * (-1));
        return T;
    }

    public Titik getRefleksiY(){
        Titik T = new Titik();
        T.setAbsis(this.absis * (-1));
        T.setOrdinat(this.ordinat);
        return T;
    }
}
