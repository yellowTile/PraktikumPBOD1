// NIM: 24060124130095
// Nama: Zulfa Nabilah
// Tanggal: 4 Mei 2026

class OperatorGenerik {

    public static <T> void Tukar(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}