package bookExercise.algorithmFourth.common;

public interface SymbolTable {

    void put(String key, String value);

    String get(String key);

    void delete(String key);

    boolean contains(String key);

    boolean isEmpty();

    int size();

    void printST();

}
