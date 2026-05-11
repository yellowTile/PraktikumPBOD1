public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Andi");
        t.addNama("Budi");
        t.addNama("Citra");
        t.addNama("Andi");

        t.showTeman();

        System.out.println("Jumlah teman: " + t.getNbelm());

        System.out.println("Nama indeks 1: " + t.getNama(1));

        t.setNama(1, "Budi Santoso");
        System.out.println("\nSetelah setNama:");
        t.showTeman();

        System.out.println("\nApakah Andi ada? " + t.isMember("Andi"));

        System.out.println("Jumlah Andi: " + t.countNama("Andi"));

        t.gantiNama("Citra", "Cindy");
        System.out.println("\nSetelah gantiNama:");
        t.showTeman();

        t.delNama("Andi");
        System.out.println("\nSetelah delNama (hapus Andi):");
        t.showTeman();
    }
}