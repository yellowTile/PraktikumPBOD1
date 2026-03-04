import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    void setNim(String nim){
        this.nim = nim;
    }
    String getNim(){
        return nim;
    }

    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }

    void setProdi(String prodi){
        this.prodi = prodi;
    }
    String getProdi(){
        return prodi;
    }

    int getJumlahSKS(){
        int jsks = 0;
        for(int i = 0; i < listMatKul.size(); i++){
            jsks = jsks + listMatKul.get(i).getSKS();
        }
        return jsks;
    }

    int getJumlahMatkul(){
        return listMatKul.size();
    }

    public void setDoswal(Dosen newDosen){
        this.dosenWali = newDosen;
    }

    public void setKendaraan(Kendaraan newKendaraan){
        this.kendaraan = newKendaraan;
    }

    void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void addMatkul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + getNim());
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i = 0; i < listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNamaMatkul());
        }
    }
}
