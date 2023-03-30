package base.sort;

import utils.CommonUtils;

import java.util.Arrays;

/**
 * <a href=https://en.wikipedia.org/wiki/Bubble_sort>Reference</a>
 */
public class BubbleSort {

    static void sort(Comparable[] a ) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if ( !CommonUtils.less(a[j], a[j+1]) ){
                    CommonUtils.exch(a, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = {
                5,6,3,1,8,7,2,4
        };
        sort(a);
        assert CommonUtils.isSorted(a);
        CommonUtils.show(a);
    }

}
