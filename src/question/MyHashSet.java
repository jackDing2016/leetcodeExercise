package question;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * key point of design a hash set
 * (1) hash function
 * (2) solution of key collision
 */

public class MyHashSet {

    private Bucket[] arr;
    private final int arrLength = 10;

    public MyHashSet() {
        arr = new Bucket[arrLength];
    }

    public int hashFunction( int index ) {
        return index % arrLength;
    }

    public void add(int key) {
        int hashKey = hashFunction( key );
        Bucket bucket = new Bucket();
        bucket.add( key );
        this.arr[hashKey] = bucket;
    }

    public void remove(int key) {
        int hashKey = hashFunction(key);
        if (contains(key)) {
            this.arr[hashKey] = null;
        }
    }

    public boolean contains(int key) {
        int hashKey = hashFunction(key);
        return this.arr[hashKey] != null;
    }

    class Bucket {

        private LinkedList<Integer> container;

        Bucket() {
            container = new LinkedList<>();
            container.indexOf(1);
        }

        public void add( int val ) {
            container.addFirst( val );
        }

    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        System.out.println(myHashSet.contains(5));
        myHashSet.add(5);
        System.out.println(myHashSet.contains(5));
        myHashSet.remove(5);
        System.out.println(myHashSet.contains(5));

    }

}
