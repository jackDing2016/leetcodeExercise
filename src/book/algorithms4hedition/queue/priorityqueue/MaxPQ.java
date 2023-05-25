package book.algorithms4hedition.queue.priorityqueue;

/**
 * This is a max priority queue simple implementation
 *
 * @param <Key>
 */
public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;   // This would represent a heap-ordered complete binary tree

    private int N = 0;  // in pq[1..N] with pg[0] unused

    public MaxPQ() {

    }

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public MaxPQ(Key[] a) {
        pq = a;
        N = a.length;
    }

    public void insert(Key k) {
        pq[++N] = k;
    }

    public Key max() {
        return null;
    }

    public Key delMax() {
        return null;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    public void displayPQ() {
        for (int i = 0; i < pq.length; i++) {
            System.out.print(pq[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{null, 15, 12, 57, 123, 66, 11, 98};
        MaxPQ<Integer> maxPQ = new MaxPQ<>(a);
        maxPQ.displayPQ();

//        maxPQ.swim(7);
        maxPQ.sink(1);
        maxPQ.displayPQ();
    }

}
