// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 11 Mei 2025
package Anabul;

public class Kucing extends Anabul {

    private double bobot;

public Kucing(String nama, double bobot) {
    super(nama);
    this.bobot = bobot;
}

public double getBobot() {
    return bobot;
}

    public Kucing(String nama) {
        super(nama); // Memanggil konstruktor Anabul untuk menyetel nama
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kucing : Meong");
    }

    @Override
    public void gerak() {
        System.out.println("Kucing sedang melata.");
    }
}
