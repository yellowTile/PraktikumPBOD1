public class MainData {
    public static void main(String[] args) {

        Data<Anabul> data = new Data<>();

        Anggora k1 = new Anggora("Milo", 3.5);
        Kembangtelon k2 = new Kembangtelon("Luna", 4.0);

        // setIsi
        data.setIsi(0, k1);
        data.setIsi(1, k2);

        // getIsi
        System.out.println("Data 0: " + data.getIsi(0).nama);
        System.out.println("Data 1: " + data.getIsi(1).nama);

        // getSize
        System.out.println("Jumlah data: " + data.getSize());
    }
}