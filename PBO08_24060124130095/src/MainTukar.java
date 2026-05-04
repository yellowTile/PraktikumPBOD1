class MainTukar {
    public static void main(String[] args) {

        // Integer
        Integer[] a = {3, 6};
        OperatorGenerik.Tukar(a, 0, 1);
        System.out.println("Integer: " + a[0] + " " + a[1]);

        // String
        String[] s = {"A", "B"};
        OperatorGenerik.Tukar(s, 0, 1);
        System.out.println("String: " + s[0] + " " + s[1]);

        // Anabul
        Anabul[] hewan = {
            new Anggora("Milo", 3.0),
            new Kembangtelon("Luna", 4.0)
        };

        OperatorGenerik.Tukar(hewan, 0, 1);
        System.out.println("Anabul: " + hewan[0].nama + " " + hewan[1].nama);
    }
}