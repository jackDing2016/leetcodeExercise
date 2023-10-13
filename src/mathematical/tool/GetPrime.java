package mathematical.tool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetPrime {

    public static void main(String[] args) {

        // init array
//        int[] a = new int[500];
        Set<Integer> a = new HashSet<>(500);

        for (int i = 0; i < 500; i++) {
            a.add(i + 1);
        }

        Iterator<Integer> iterator = a.iterator();
        int seq = 0;
        while (iterator.hasNext()) {
            int aa = iterator.next();
            boolean isPrime = false;
            for (int j = aa - 1; j > 1; j--) {
                if (aa % j == 0) {
                    break;
                }
                if (j == 2) isPrime = true;
            }
            if (isPrime) System.out.println( seq++ + ":" + aa);
        }
    }

}
