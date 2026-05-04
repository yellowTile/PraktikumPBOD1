public class FungsiGenerik {

    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.bobot + k2.bobot;
    }
}