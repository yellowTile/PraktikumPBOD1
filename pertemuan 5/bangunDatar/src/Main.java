// import java.security.Permissions;

public class Main {
    public static void main(String args[]){
        lingkaran l1 = new lingkaran(7, "Biru", "Solid", 0);
        lingkaran l2 = new lingkaran(10, "Merah", "Putus-putus", 0);

        l1.setJari(14);


        l1.printInfo();
        System.out.println("Luas l1: " + l1.getLuas());
        System.out.println("Keliling l1: " + l1.getKeliling());

        l2.printInfo();
        System.out.println("Luas l2: " + l2.getLuas());
        System.out.println("Keliling l2: " + l2.getKeliling());

        System.out.println();

        persegi p1 = new persegi(5, "Hijau", "Solid");
        persegi p2 = new persegi(8, "Kuning", "Putus-putus");


        p1.printInfo();
        System.out.println("Luas p1: " + p1.getLuas());
        System.out.println("Keliling p1: " + p1.getKeliling());
        System.out.println("Diagonal p1: " + p1.getDiagonal());

        p2.printInfo();
        System.out.println("Luas p2: " + p2.getLuas());
        System.out.println("Keliling p2: " + p2.getKeliling());
        System.out.println("Diagonal p2: " + p2.getDiagonal());

        System.out.println();
        System.out.println("Jari-jari l1: " + l1.getJari());

        bangunDatar.printCounterBangunDatar();


        // bagian 1 no. 3(yang pertama gabisa karena abstract)
        // bangunDatar B1 = new bangunDatar();
        bangunDatar P1 = new persegi();
        persegi P3 = new persegi(5, "abu", "solid");
        bangunDatar L1 = new lingkaran(7, "kuning", "solid", 0);
        // lingkaran L1 = new lingkaran(14, "kuning", "solid", 0);
//       yang ke 5 gabisa soalnya duplikat


        System.out.println("sama kah?" + p1.isEquals(p2));

        p2.zoomIn();
        System.out.println("hasil after zoomIn: " + p2.getSisi());

        }


        // apakah method pada langkah nomor 4 dapat digunakan untuk membaningkan objek bangun datar yang berbeda?
        // ya, bisa. soalnya isEqualLuas() dan isEqualKeliling() paka reference type bangunDatar, jadi bisa dibandingin

        // jika bangunDatar tidak dijadikan abstract class,. dapatkah membuat method idEqualLUas() dan isEqualKeliling() mengapa?
        // secara sintaks bisa, tapi secara konsep kurang tepat, class bangunDatar=konsep umum(abstraksi), bukan bentuk nyata, luas n keliling gapunya rumus umum,
        // klo ga abstract: harus ngasih implementasi getLuas() n getKeliling() di bangunDatar, padahal implementasinya beda utk tiap bangun


        // keuntungan method zoomIn(), zoomOut(), dan zoom() dalam interface Iresize dibanding abstract di bangunDatar yaitu semua class yang extends bangunDatar wajib punya implementasi si method method tsb, 
        // tapi ga semua bentuk bangun datar butuh zoom. jadinya kalo masuk interface lebih flexible
}
