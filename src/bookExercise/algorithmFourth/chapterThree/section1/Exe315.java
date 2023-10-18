package bookExercise.algorithmFourth.chapterThree.section1;

import bookExercise.algorithmFourth.common.Node;
import bookExercise.algorithmFourth.common.SymbolTable;

public class Exe315 {

    public static class SequentialSearchST implements SymbolTable {
        private Node first;

        @Override
        public void put(String key, String value) {
            for (Node x = first; x != null; x = x.next)
                if (key.equals(x.key)) {
                    x.value = value;
                    return;
                }
            // Search hit: update val.
            first = new Node(key, value, first); // Search miss: add new node.
        }

        @Override
        public String get(String key) {
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
            return 0;
        }

        @Override
        public void printST() {

        }
    }

}
