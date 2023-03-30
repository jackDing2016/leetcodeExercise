package base.sort;


public class InsertSort extends Sort  {
    @Override
    public void sort(Comparable[] a) {

        for ( int i = 1; i < a.length; i++ ) {
            for ( int j = i ; j > 0; j-- ) {
                if ( less(a[j], a[j-1]) ) exch(a,j,j-1);
            }
        }

    }

    public static void main(String[] args) {
        Integer[] a = {
                5,6,3,1,8,7,2,4
        };
        Sort sort = new InsertSort();
        sort.sort(a);
        assert isSorted(a);
        show(a);
    }

}
