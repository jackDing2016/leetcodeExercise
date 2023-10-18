package bookExercise.algorithmFourth.common;

public interface OrderedSymbolTable extends Comparable  {

    void put(String key, String value);

    String get(String key);

    void delete(String key);

    boolean contains(String key);

    boolean isEmpty();

    String min();

    String max();

    // number of keys less than key
    int rank(String key);

    // key of rank key
    String select(String key);
}
