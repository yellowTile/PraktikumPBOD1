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
    }
}