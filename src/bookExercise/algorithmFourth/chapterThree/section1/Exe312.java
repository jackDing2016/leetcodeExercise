package bookExercise.algorithmFourth.chapterThree.section1;

import bookExercise.algorithmFourth.common.SymbolTable;

public class Exe312 {
    public static class ArrayST implements SymbolTable {

        private String[] keys;
        private String[] values;

        private int size;

        public ArrayST() {
            keys = new String[10];
            values = new String[10];
        }

        @Override
        public void put(String key, String value) {
            if (null == key || "".equals(key)) {
                return;
            }
            for (int i = 0; i < keys.length; i++) {
                if (key.equals(keys[i])) {
                    values[i] = value;
                    //                size++;
                    return;
                }
            }
            keys[size] = key;
            values[size] = value;
            size++;
        }

        @Override
        public void printST() {

        }

        @Override
        public String get(String key) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i].equals(key)) {
                    return values[i];
                }
            }
            return null;
        }

        @Override
        public void delete(String key) {

        }

        @Override
        public boolean contains(String key) {
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
    }
}
