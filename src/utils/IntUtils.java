package utils;

public class IntUtils {

    public static void sort(int[] a) {

    }

//    public static boolean less(Comparable v, Comparable w) {
//        return v.compareTo(w) < 0;
//    }

    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(int[] a) {
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

//    public static boolean isSorted(Comparable[] a) {
//        for (int i = 1; i < a.length; i++) {
//            if (less(a[i], a[i-1])) return false;
//        }
//        return true;
//    }



}
