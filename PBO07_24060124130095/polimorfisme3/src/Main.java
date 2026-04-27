// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 27 April 2026

public class Main {
    public static void main(String[] args) {

        // Polimorfisme: tipe referensi sama (Anabul), objek beda
        Anabul a1 = new Kucing("Milo");
        Anabul a2 = new Anjing("Buddy");
        Anabul a3 = new Burung("Cici");

        Anabul[] daftar = {a1, a2, a3};

        for (Anabul a : daftar) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}