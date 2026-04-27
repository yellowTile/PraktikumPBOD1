public class Main {
    public static void main(String[] args) {

       
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek m1 (default):");
        m1.tampil();

        
        Mahasiswa m2 = new Mahasiswa("123", "Budi", "Informatika");
        System.out.println("Objek m2 (parameter):");
        m2.tampil();

    
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Objek m3 (clone dari m2):");
        m3.tampil();

        

        m1.setProgramStudi();
        System.out.println("m1 setelah setProgramStudi():");
        m1.tampil();

  
        m1.setProgramStudi("Sistem Informasi");
        System.out.println("m1 setelah setProgramStudi(String):");
        m1.tampil();

     
        m1.setProgramStudi(m2);
        System.out.println("m1 setelah setProgramStudi(Mahasiswa):");
        m1.tampil();
    }
}