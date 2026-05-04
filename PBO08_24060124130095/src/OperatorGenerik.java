class OperatorGenerik {

    public static <T> void Tukar(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}