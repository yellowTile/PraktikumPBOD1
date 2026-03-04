public class MataKuliah {
    String idMatKul;
    String namaMatkul;
    int SKS;

    public MataKuliah(){
        System.out.println("Sebuah Mata Kuliah");
    }
    public MataKuliah(String idMatKul, String namaMatkul, int SKS){
        this.idMatKul = idMatKul;
        this.namaMatkul = namaMatkul;
        this.SKS = SKS;
    }

    void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }
    String getidMatKul(){
        return idMatKul;
    }
    void setnamaMatKul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }
    public String getNamaMatkul(){
        return namaMatkul;
    }
    void setSKS(int SKS){
        this.SKS = SKS;
    }
    public int getSKS(){
        return SKS;
    }
}
