// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 11 Mei 2025
package Anabul;

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor Anabul untuk menyetel nama
    }


    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }

    public void gerak() {
        System.out.println("Anjing sedang melata.");
    }
}
