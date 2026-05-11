/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Kucing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

public class Kucing extends Anabul {

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
