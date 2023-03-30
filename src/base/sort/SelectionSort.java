package base.sort;


/**
 * <a href=https://en.wikipedia.org/wiki/Bubble_sort>Reference</a>
 */
public class SelectionSort extends Sort {

     @Override
     public void sort(Comparable[] a ) {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if ( less(a[j], a[min]) ) min = j;
            }
            exch(a, i, min);
        }

    }

    public static void main(String[] args) {
        Integer[] a = {
                5,6,3,1,8,7,2,4
        };
        Sort sort = new SelectionSort();
        sort.sort(a);
        assert isSorted(a);
        show(a);
    }
}
