package test;

import base.sort.Sort;

public class Test extends Sort {

    public static void main(String[] args) {
        Integer[] a = {
                5,6,3,1,8,7,2,4,0
        };
        new Test().rightShiftArray(a);
        show(a);
    }

    void rightShiftArray(Integer[] arr) {
        for ( int i = arr.length - 1; i > 0; i-- ) {
            exch(arr, i, i-1);
        }
    }


    @Override
    public void sort(Comparable[] a) {

    }
}
