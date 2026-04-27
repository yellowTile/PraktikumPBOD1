// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 27 April 2026

public class PolimorfismeCoercion {

    public static void main(String[] args) {


        System.out.println("=== a. Ilustrasi Polimorfisme ===");

        int nilai = 65;


        System.out.println("Integer: " + nilai);

        char karakter = (char) nilai;
        System.out.println("Karakter: " + karakter);


        double real = (double) nilai;
        System.out.println("Real: " + real);

        String str = "123";
        int intVal = Integer.parseInt(str);
        double doubleVal = Double.parseDouble(str);

        System.out.println("String ke int: " + intVal);
        System.out.println("String ke double: " + doubleVal);

  
        String hasilString = Integer.toString(nilai);
        System.out.println("Integer ke String: " + hasilString);


  
        System.out.println("\n=== b. Konversi bolak-balik ===");

        int a = 10;
        double b = (double) a;
        int c = (int) b;

        System.out.println("Integer awal: " + a);
        System.out.println("Jadi double: " + b);
        System.out.println("Kembali ke integer: " + c);



        System.out.println("\n=== c. String ke Integer ===");

        String X = "1234";
        String Y = "5678";


        String S = X + Y;


        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (konkatenasi): " + S);
        System.out.println("Z (penjumlahan): " + Z);

        System.out.println("\n=== d. String ke Double ===");

        String P = "12.34";
        String Q = "56.78";


        String R = P + Q;


        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R (konkatenasi): " + R);
        System.out.println("D (penjumlahan): " + D);



        System.out.println("\n=== e. Konversi S ke Integer ===");

        Integer A = Integer.parseInt(S);
        System.out.println("Nilai A: " + A);


   
        System.out.println("\n=== f. Konversi Integer ke String ===");

        String T = A.toString();
        System.out.println("Nilai T: " + T);
    }
}