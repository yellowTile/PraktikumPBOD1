// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 27 April 2026

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: guk-guk");
    }
}