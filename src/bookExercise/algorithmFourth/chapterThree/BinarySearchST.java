package bookExercise.algorithmFourth.chapterThree;


import bookExercise.algorithmFourth.common.SymbolTableGeneric;


public class BinarySearchST<Key extends Comparable<Key>, Value> implements SymbolTableGeneric<Key, Value> {
    public static void main(String[] args) {
        SymbolTableGeneric<Integer, String> st = new BinarySearchST<>();
        st.put(6, "peter");
        st.put(2, "jack");
        st.put(3, "tom");
        st.put(8, "jerry");
        st.put(7, "gordon");
        st.put(1, "alex");
        st.printST();
    }

    private Key[] keys;

    private Value[] values;

    private int size;

    public BinarySearchST() {
//        keys = (Key[]) new Comparable<>[10];
//        values = (Value[]) new Object[10];


        keys = (Key[]) new Comparable[10];
        values = (Value[]) new Object[10];
    }

    private int rank(Key key) {

//        for (int i = 0; i < size; i++) {
//            if (key.compareTo(keys[i]) < 0) {
//                return i + 1;
//            }
//
//        }
        if (size == 0) return 1;
        return binarySearchHelper(0, size - 1, key) + 1;
    }

    public int binarySearchHelper(int low, int high, Key key) {

        // base case
        if (low >= high) {
            if (key.compareTo(keys[low]) < 0) {
                return low;
            } else {
                return low + 1;
            }
        }


        int mid = (low + high) / 2;


        if (key.compareTo(keys[mid]) < 0) {
            return binarySearchHelper(low, mid, key);
        } else if (key.compareTo(keys[mid]) == 0) {
            return mid;
        } else {
            return binarySearchHelper(mid + 1, high, key);
        }

    }


    @Override
    public void put(Key key, Value value) {

        // get rank of key
        int rank = rank(key);

        // set key of value

        for (int i = size - 1; i >= rank - 1; i--) {
            keys[i + 1] = keys[i];
            values[i + 1] = values[i];
        }

        keys[rank - 1] = key;
        values[rank - 1] = value;

        size++;

    }

    @Override
    public Value get(Key key) {
        return null;
    }

    @Override
    public void delete(Key key) {

    }

    @Override
    public boolean contains(Key key) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printST() {

        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + ": " + values[i]);
        }
    }
}

