// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 11 Mei 2025

package Anabul;

public class Piaraan {

    private int nbElm;
    private Koleksi<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new Koleksi<>();
        nbElm = 0;
    }

    // i. getNbelm
    public int getNbelm() {
        return nbElm;
    }

    // ii. enqueue (tambah akhir)
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbElm++;
    }

    // iii. isMember
    public boolean isMember(Anabul a) {
        for (int i = 0; i < nbElm; i++) {
            Anabul temp = (Anabul) Lanabul.wadah[i];
            if (temp == a) {
                return true;
            }
        }
        return false;
    }

    // iv. getAnabul (antrian depan)
    public Anabul getAnabul() {
        if (nbElm > 0) {
            return (Anabul) Lanabul.wadah[0];
        }
        return null;
    }

    // v. dequeue (ambil & hapus depan)
    public Anabul dequeueAnabul() {
        if (nbElm == 0) return null;

        Anabul depan = (Anabul) Lanabul.wadah[0];

        Lanabul.delete(0);
        nbElm--;

        return depan;
    }

    // c. showAnabul
    public void showAnabul() {
        System.out.println("== Anabul dalam Antrian ==");
        for (int i = 0; i < nbElm; i++) {
            Anabul a = (Anabul) Lanabul.wadah[i];
            System.out.println(a.getNama());
        }
    }

    // d. countKucing
    public int countKucing() {
        int count = 0;
        for (int i = 0; i < nbElm; i++) {
            if (Lanabul.wadah[i] instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing (asumsi Kucing punya getBobot())
    public double bobotKucing() {
        double total = 0;

        for (int i = 0; i < nbElm; i++) {
            if (Lanabul.wadah[i] instanceof Kucing) {
                Kucing k = (Kucing) Lanabul.wadah[i];
                total += k.getBobot(); // asumsi ada
            }
        }

        return total;
    }

    // f. showJenisAnabul
    public void showJenisAnabul() {
        System.out.println("== Jenis Anabul ==");
        for (int i = 0; i < nbElm; i++) {
            Anabul a = (Anabul) Lanabul.wadah[i];

            System.out.println(
                a.getNama() + " -> " +
                a.getClass().getSimpleName()
            );
        }
    }
}