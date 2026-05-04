public class MainDatum {
    public static void main(String[] args) {
        Anggora k1 = new Anggora("Milo", 3.5);
        Kembangtelon k2 = new Kembangtelon("Luna", 4.0);

        Datum<Anabul> d = new Datum<>();

        d.setIsi(k1);
        System.out.println("Isi datum: " + d.getIsi().nama);

        d.setIsi(k2);
        System.out.println("Isi datum: " + d.getIsi().nama);
    }
}