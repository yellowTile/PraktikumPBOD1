import java.util.ArrayList;

public class Teman {
    private int nbElm;
    private ArrayList<String> Lnama;

    public Teman(){
        Lnama = new ArrayList<>();
        nbElm = 0;
    }

    int getNbelm(){
        return nbElm;
    }

    String getNama(int indeks){
        if (indeks >= 0 && indeks < nbElm){
            return Lnama.get(indeks);
        } else {
            return "indeks ga valid";
        }
    }

    void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < nbElm){
            Lnama.set(indeks, nama);
        } else {
            System.out.println("indeks ga valid");
        }
    }

    void addNama(String nama){
        Lnama.add(nama);
        nbElm++;
    }

    void delNama(String nama){
        int i = 0;
        while(i < nbElm && !Lnama.get(i).equals(nama)){
            i++;
        }
        if (i < nbElm) {
            for (int x = i; x < nbElm - 1; x++) {
                Lnama.set(x, Lnama.get(x + 1));
            }
            Lnama.remove(nbElm - 1);
            nbElm--;
        } else {
            System.out.println("Nama tidak ditemukan");
        }
    }

    boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    void gantiNama(String nama, String namaBaru){
        for(int i = 0; i < nbElm; i++){
            if(Lnama.get(i).equals(nama)){
                Lnama.set(i, namaBaru);
                return; 
            }
        }
    }

    int countNama(String nama){
        int n = 0;
        for(int i = 0; i < nbElm; i++){
            if(Lnama.get(i).equals(nama)){
                n++;
            }
        }
        return n;
    }

    void showTeman(){
        System.out.println("Daftar teman:");
        for(int i = 0; i < nbElm; i++){
            System.out.println("- " + Lnama.get(i));
        }
    }
}