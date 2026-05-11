// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 11 Mei 2025

package Anabul;

import java.util.Random;

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Anabul> KoleksiAnabul = new Koleksi<>();

        String[] namaKucing = {"Oyen", "Milo", "Kitty", "Snowy"};
        String[] namaAnjing = {"Blacky", "Bruno", "Doggo", "Charlie"};
        String[] namaBurung = {"Rio", "Polly", "Tweety", "Beo"};

        // Menambahkan elemen ke dalam KoleksiAnabul tanpa menggunakan loop
        KoleksiAnabul.add(new Kucing(namaKucing[0]));
        KoleksiAnabul.add(new Anjing(namaAnjing[0]));
        KoleksiAnabul.add(new Burung(namaBurung[0]));
        KoleksiAnabul.add(new Kucing(namaKucing[1]));
        KoleksiAnabul.add(new Anjing(namaAnjing[1]));
        KoleksiAnabul.add(new Burung(namaBurung[1]));
        KoleksiAnabul.add(new Kucing(namaKucing[2]));
        KoleksiAnabul.add(new Anjing(namaAnjing[2]));
        KoleksiAnabul.add(new Burung(namaBurung[2]));
        KoleksiAnabul.add(new Kucing(namaKucing[3]));

        KoleksiAnabul.showAll(); // Menampilkan semua elemen dalam koleksi

        System.out.println("== Semua Anabul bersuara ==\n");
        KoleksiAnabul.bersuarasemua(); // Memanggil suara semua Anabul
    }
}


// renungan : intinya bikin kumpulan objek. objek yg pengen disimpan bisa ditaro di array statis or dinamis.
// data yg ada bisa di akses, ubah, hapus, dll

