public class persegi extends bangunDatar {
    private double sisi;

    public persegi(){
        setJmlSisi(4);
    }

    public persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi* sisi;
    }

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }


    // bagian 1, dia error soalnya jmlSisi, warna, dan border 
    // di private di dalam parentnya yaitu bangunDatar
    // public persegi(double sisi, String warna, String border){
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }


    // bagian 2 (intinya bener kalo udah dibikin konstruktor di parentnya)
    // public persegi(double sisi, String warna, String border){
    //     super(4, warna, border);
    //     this.sisi = sisi;
    // }

    // bagian 3 overriding method
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // bagian 3 overriding method yang sebelumnya udah static
    // gabisa, karena static memang tidak dapat di overriding;
    // public void printCounterBangunDatar(){
    //     super.printCounterBangunDatar();
    //     System.out.println("hehe");
    // }

    // bagian 4, bisa digunakan kalo pake this, karena private dapat diakses oleh anaknya
    // public persegi(double sisi, String warna, String border){
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }

    // bagian 5, hasilnya semuanya error jika parentnya tidak bisa di extends
    // untuk bagian printinfo jadinya error kalau di parent printinfonya ditambahakan final 
}
