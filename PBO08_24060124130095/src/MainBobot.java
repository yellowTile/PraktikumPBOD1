// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 4 Mei 2026

public class MainBobot {
    public static void main(String[] args) {
        Anggora k1 = new Anggora("Milo", 3.5);
        Kembangtelon k2 = new Kembangtelon("Luna", 4.5);

        double total = FungsiGenerik.Bobot2(k1, k2);
        System.out.println("Total bobot: " + total);
    }
}