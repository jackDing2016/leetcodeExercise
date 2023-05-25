package book.algorithms4hedition.binarysearchtree;

public class BST<Key extends Comparable<Key>, Value> {

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        // Nodes in subtree rooted here
        // What's that mean?
        private int N;

        public Node(Key key, Value value, int i) {
            this.key = key;
            this.value = value;
            this.N = i;
        }
    }

    // root of node
    private Node root;

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }



    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.value;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        return x;
    }

    public Key min() {
        return min(root).key;
    }

    private Node min(Node x) {
        if (x.left == null) return x;
        return min(x.left);
    }

    public void max() {

    }

    public Key select(int k) {
        return null;
    }

    private Node select(Node x, int k) {
        if (x == null) return null;
        int t = size(x.left);
        if (t > k) return select(x.left, k);
        else if (t < k) return select(x.right, k - t - 1);
        else return x;
    }

    public Key floor(Key key) {
//        Node x = float(root, key);
        return null;
    }

//    private Node floor


}
