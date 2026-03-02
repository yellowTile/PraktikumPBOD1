// Nama File   : MTitik.java
// Deskripsi   : beerisi main class dari titik
// Pembuat     : Zulfa Nabilah
// Tanggal     : 26 Februari 2026


public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        T3.setAbsis(3);
        T3.setOrdinat(5);

        Titik T4 = new Titik(7, 8);
        T4.printTitik();

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah objek Titik = " + T3.getCounterTitik());
        // yg ini dapet peringatan

        T1.printcounterTitik();
        T3.printcounterTitik();
    }
}
