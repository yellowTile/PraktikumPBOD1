// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 4 Mei 2026

public class MainData {
    public static void main(String[] args) {

        Data<Anabul> data = new Data<>();

        Anggora k1 = new Anggora("Milo", 3.5);
        Kembangtelon k2 = new Kembangtelon("Luna", 4.0);

        
        data.setIsi(0, k1);
        data.setIsi(1, k2);

       
        System.out.println("Data 0: " + data.getIsi(0).nama);
        System.out.println("Data 1: " + data.getIsi(1).nama);

        
        System.out.println("Jumlah data: " + data.getSize());
    }
}

// Generik bekerja dengan:
// Menggunakan tipe parameter (<T>)
// Membuat class & method bisa dipakai untuk berbagai tipe
// Menghindari duplikasi kode
// Bisa dibatasi dengan extends