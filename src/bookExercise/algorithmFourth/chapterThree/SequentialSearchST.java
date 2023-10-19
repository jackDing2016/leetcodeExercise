package bookExercise.algorithmFourth.chapterThree;

import bookExercise.algorithmFourth.common.SymbolTableGeneric;

public class SequentialSearchST<KEY extends Comparable<KEY>, VALUE> implements SymbolTableGeneric<KEY, VALUE> {

    public static void main(String[] args) {
        SymbolTableGeneric<String, String> st = new SequentialSearchST<>();
        st.put("jack", "a");
        st.put("tom", "b");
        st.put("alex", "c");
        st.put("sandy", "e");
        st.put("kevin", "d");
//        st.printST();

        st.delete("jack");
        st.printST();
    }

    private Node first;

    private int size;

    private class Node { // linked-list node
        KEY key;
        VALUE val;
        Node next;

        public Node(KEY key, VALUE val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }


    @Override
    public void put(KEY key, VALUE value) {

        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key)) {
                x.val = value;
                return;
            } // Search hit: update val.

        first = new Node(key, value, first); // Search miss: add new node.
        size++;
    }

    @Override
    public VALUE get(KEY key) {
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key))
                return x.val;
        // search hit
        return null;
        // search miss
    }

    @Override
    public void delete(KEY key) {

        if (isEmpty()) return;

        if (key.compareTo(first.key) == 0) {
            first = first.next;
            size--;
        }// if first node should be deleted.

        else {
            Node node = first;
            Node next = first.next;
            while (node.next != null) {
                if (next.key.compareTo(key) == 0) {
                    node.next = next.next;
                    size--;
                    break;
                }
                node = next;
                next = next.next;
            }
        }// if not first node should be deleted.

    }

    @Override
    public boolean contains(KEY key) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printST() {
        Node node = first;
        while (node != null) {
            System.out.println(node.key + ": " + node.val);
            node = node.next;
        }
    }
}