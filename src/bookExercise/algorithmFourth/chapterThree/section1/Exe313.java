package bookExercise.algorithmFourth.chapterThree.section1;

import bookExercise.algorithmFourth.common.Node;
import bookExercise.algorithmFourth.common.SymbolTable;

public class Exe313 {

    public static void main(String[] args) {
        SymbolTable st = new OrderedSequentialSearchST();
        st.put("name", "Jack");
        st.put("age", "35");
        st.put("career", "Computer Science");
        st.put("hobby", "Snooker");
        st.put("weight", "65kg");

        st.delete("age");

        st.printST();
    }

    public static class OrderedSequentialSearchST implements SymbolTable {

        private Node list;

        private int size;

        public OrderedSequentialSearchST() {
            list = new Node();
        }

        @Override
        public void put(String key, String value) {

            Node node = list.next;
            // if list is empty
            if (node == null) {
                list.next = new Node(key, value);
                size++;
            }
            // else if list is not empty
            else {
                while (true) {
                    // if list contains key
                    if (key.equals(node.key)) {
                        node.value = value;
                        break;
                    }
                    //  node.next = null which indicate that arrive tail of list
                    if (node.next == null) {
                        node.next = new Node(key, value);
                        size++;
                        break;
                    }
                    node = node.next;
                }
            }

        }

        @Override
        public String get(String key) {
            Node node = list.next;
            while (node != null) {
                if (key.equals(node.key)) return node.value;
                node = node.next;
            }
            return null;
        }

        @Override
        public void delete(String key) {

            if (list == null) return;

            Node node = list.next;
            while (node != null) {
                if (node.next == null) break;
                else {
                    if (node.next.key.equals(key)) {
                        node.next = node.next.next;
                    }
                }
                node = node.next;
            }

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

        @Override
        public void printST() {
            Node node = list.next;
            while (node != null) {
                System.out.println(node.key + ": " + node.value);
                node = node.next;
            }
        }
    }

}
