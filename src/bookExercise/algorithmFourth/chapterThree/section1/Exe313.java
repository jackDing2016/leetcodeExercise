package bookExercise.algorithmFourth.chapterThree.section1;

import bookExercise.algorithmFourth.common.Node;
import bookExercise.algorithmFourth.common.SymbolTable;

public class Exe313 {

    public static void main(String[] args) {
        SymbolTable st = new OrderedSequentialSearchST();
        st.put("age", "35");

        st.put("weight", "65kg");
        st.put("career", "Computer Science");

        st.put("name", "Jack");
        st.put("hobby", "Snooker");
//        st.put("bbb", "bbb");


//        st.delete("age");


//        st.printST();
    }

    public static class OrderedSequentialSearchST implements SymbolTable {

        private Node list = null;

        private int size;

        public OrderedSequentialSearchST() {
            list = new Node();
        }


        // compare key select the first one of the string to compare by the natural alphabet
        private boolean compare(String keyOne, String keyTwo) {
//            System.out.println(keyOne.charAt(0));
//            System.out.println(keyTwo.charAt(0));
//            System.out.println(keyOne.charAt(0) < keyTwo.charAt(0));
//            System.out.println("---------------------------------");
            return keyOne.charAt(0) < keyTwo.charAt(0);

        }

        @Override
        public void put(String key, String value) {
            if (list.next == null) {
                list.next = new Node(key, value);
            } else {
                Node node = list.next;

                // is first
                if (compare(key, node.key)) {
                    Node nodeToPut = new Node(key, value);
                    nodeToPut.next = list.next;
                    list.next = nodeToPut;
                }

                // is not first
                while (true) {

                    if (node.next == null) {
                        node.next = new Node(key, value);
                        break;
                    } else if (!compare(key, node.key) && compare(key, node.next.key)) {
                        Node nodeToPut = new Node(key, value);
                        nodeToPut.next = node.next;
                        node.next = nodeToPut;
                        break;
                    }
                    node = node.next;
                }
            }
            System.out.println("-------------------");
            printST();
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
