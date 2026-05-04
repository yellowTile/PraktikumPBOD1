// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 27 April 2026

public class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;

    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.ProgramStudi = prodi;
    }

    public Mahasiswa(Mahasiswa mhsLain) {
        this.NIM = mhsLain.NIM;
        this.Nama = mhsLain.Nama;
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa mhsLain) {
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

   
    public void tampil() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
        System.out.println("-------------------------");
    }
}