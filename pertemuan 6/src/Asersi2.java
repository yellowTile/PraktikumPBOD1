// File         : Asersi2.java
// Deskkripsi   : Program untuk demo asersi, yang akan menolak iput jari-jari lingkaran yang bernilai nol

// class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"Jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}


// PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// jawaban : terdapat kekurangan secara konsep dalam penggunaan asersi. dimana menggunakan assert untuk validasi nilai input,
//           padahal assert hanya diperuntukkan untuk mendeteksi kesalahan logika internal program