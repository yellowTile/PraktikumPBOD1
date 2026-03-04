public class Dosen {
    String NIP;
    String Nama;
    String Prodi;

    public Dosen(){
        System.out.println("****");
    }
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    void setNIP(String NIP){
        this.NIP = NIP;
    }
    String getNIP(){
        return NIP;
    }
    
    void setNama(String Nama){
        this.Nama = Nama;
    }
    String getNama(){
        return Nama;
    }

    void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
    String getProdi(){
        return Prodi;
    }

}
