public class Kendaraan {
    String noPlat;
    String jenis;

    public Kendaraan(){
        System.out.println("Sebuah Kendaraan");
    }
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    String getnoPlat(){
        return noPlat;
    }

    void setjenis(String jenis){
        this.jenis = jenis;
    }
    String getJenis(){
        return jenis;
    }
}
