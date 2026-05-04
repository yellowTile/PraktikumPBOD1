// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 27 April 2026

public class Kucing extends Anabul {
    double bobot;

    public Kucing(String nama) {
        super(nama);
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }


    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: meong");
    }
}