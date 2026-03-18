public class lingkaran extends bangunDatar implements Iresize{
    double jari;

    public lingkaran(){
    }

    public lingkaran(double jari, String warna, String border, int jmlSisi){
        super(jmlSisi,warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }
    public double getKeliling(){
        return jari*2* Math.PI;
    }

    // @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    // @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("jari: " + jari);
    }

    // bagian 5, seluruh lingkaran jadi error karena parentnya tidak bisa di extends
}
