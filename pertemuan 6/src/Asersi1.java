// File         : Asersi1.java
// Deskkripsi   : Program untuk menunjukkan asersi
// Pembuat      : Zulfa Nabilah - 24060124130095
// Tanggal      : 27 Maret 2025

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert(x < 0):"ada kesalahan dalam kode";
            System.out.println("x bilangan negatif");
        }
    }
}
