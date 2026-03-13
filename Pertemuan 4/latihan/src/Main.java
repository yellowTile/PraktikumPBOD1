import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap DT1 = new DosenTetap("123456789", "Bambang", LocalDate.of(1980,1,1), LocalDate.of(2016,5,5), 4500000,"Fakultas Sains dan Matematika", "98765432");

        DosenTetap DT2 = new DosenTetap("9545647548", "Andi", LocalDate.of(1990,5,5), LocalDate.of(2015,1,1), 5000000,"Fakultas Sains dan Matematika", "78647324");

        DT1.printInfo();
        DT2.printInfo();

        Tendik T1 = new Tendik("34567890", "Ica", LocalDate.of(1993, 6, 20), LocalDate.of(2009, 8, 12), 4700000, "akaademik");
        T1.printInfo();
        
    }
}
