// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 4 Mei 2026

class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T nilai) {
        ruang[posisi] = nilai;
        banyak++;
    }

    public T getIsi(int posisi) {
        return ruang[posisi];
    }

    public int getSize() {
        return banyak;
    }
}