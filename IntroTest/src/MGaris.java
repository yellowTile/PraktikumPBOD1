public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(0, 0);
        Titik T2 = new Titik(2, 4);
        Titik T3 = new Titik(-2, 0);
        Titik T4 = new Titik(0, 4);
        Titik T5 = new Titik(2, 0);
        Titik T6 = new Titik(2, 4);

        Garis g1 = new Garis(T1, T2);
        Garis g2 = new Garis(T3, T4);
        Garis g3 = new Garis(T5, T6);
        Garis gVertikal = new Garis(new Titik(3, 1), new Titik(3, 5));
        Garis gHorizontal = new Garis(new Titik(1, 2), new Titik(5, 2));

        System.out.println("--- Print Garis ---");
        g1.printGaris();
        g2.printGaris();
        gVertikal.printGaris();
        gHorizontal.printGaris();

        System.out.println("\n--- Panjang Garis ---");
        System.out.println("g1: " + g1.panjang());
        System.out.println("gVertikal: " + gVertikal.panjang());
        System.out.println("gHorizontal: " + gHorizontal.panjang());

        System.out.println("\n--- Gradien Garis ---");
        System.out.println("g1: " + g1.gradien());
        System.out.println("gVertikal: " + (gVertikal.isVertikal() ? "Vertikal" : gVertikal.gradien()));
        System.out.println("gHorizontal: " + (gHorizontal.isHorizontal() ? "Horizontal" : gHorizontal.gradien()));

        System.out.println("\n--- Titik Tengah ---");
        Titik tmG1 = g1.titikTengah();
        System.out.println("g1: (" + tmG1.getAbsis() + ", " + tmG1.getOrdinat() + ")");
        Titik tmGV = gVertikal.titikTengah();
        System.out.println("gVertikal: (" + tmGV.getAbsis() + ", " + tmGV.getOrdinat() + ")");

        System.out.println("\n--- Persamaan Garis ---");
        System.out.println("g1: " + g1.persamaanGaris());
        System.out.println("g2: " + g2.persamaanGaris());
        System.out.println("gVertikal: " + gVertikal.persamaanGaris());
        System.out.println("gHorizontal: " + gHorizontal.persamaanGaris());

        System.out.println("\n--- Sejajar / Tegak Lurus ---");
        System.out.println("g1 sejajar g2? " + g1.sejajarDengan(g2));
        System.out.println("g1 tegak lurus g2? " + g1.tegakLurus(g2));
        System.out.println("gVertikal tegak lurus gHorizontal? " + gVertikal.tegakLurus(gHorizontal));

        System.out.println("\nJumlah objek Garis = " + Garis.getCounterGaris());
    }
}