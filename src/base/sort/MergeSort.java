package base.sort;

public class MergeSort extends Sort{
    @Override
    public void sort(Comparable[] a) {

    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if ( lo < hi ) {
            int mid = ( lo + hi ) / 2;
            sort(a, lo, mid);
            sort(a, mid+1, hi);
            merge(a, lo, mid, hi);
        }
    }

    static void merge(Comparable[] a, int lo, int mid, int hi) {

        Comparable[] auxiliaryArr = new Integer[ hi - lo ];

        for ( int i = 0; i < auxiliaryArr.length; i++ ) {
            auxiliaryArr[i] = a[i + lo];
        }

        int len = (hi-lo)/2 + 1;

        int leftIdx = lo, rightIdx=mid;
        for (int i = 0; i < len; i++){
            if (less(auxiliaryArr[leftIdx], auxiliaryArr[rightIdx])) {
                a[lo+i]=auxiliaryArr[leftIdx++];
            }
            else {
                a[lo+i]=auxiliaryArr[rightIdx++];
            }
        }

    }

}
