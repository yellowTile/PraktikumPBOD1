// File         : AngkaSial.java
// Deskripsi    : Program penggunaan exception buatan sendiri pengenalan klasua

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// pertanyaan: ketika eksepsi terjadi, apakah baris System.out.println(angka + "bukan angka sial"); pada AngkaSial.java di atas dieksekusi?
// jawaban: jalan pas cobaAngka = 10(dieksekusi kalo ga terjadi eksepsi)

// pertanyaan: apakah baris }catch(AngkaSialException ase){ pada AngkaSial.java di atas dieksekusi?
// jawaban: dieksekusi, karena exception yang dilempar waktu angka 13 ditangkap blok catch

