package bookExercise.algorithmFourth.common;

public interface SymbolTableGeneric<KEY, VALUE> {

    void put(KEY key, VALUE value);

    VALUE get(KEY key);

    void delete(KEY key);

    boolean contains(KEY key);

    boolean isEmpty();

    int size();

    void printST();

}
