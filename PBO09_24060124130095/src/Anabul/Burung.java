// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 11 Mei 2025
package Anabul;

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama); // Memanggil konstruktor Anabul untuk menyetel nama
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Burung : Cuit");
    }

    @Override
    public void gerak() {
        System.out.println("Burung sedang terbang.");
    }
}
