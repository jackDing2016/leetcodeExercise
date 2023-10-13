package question.pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * <a href=https://leetcode.com/problems/minimum-index-sum-of-two-lists/>Go to Quest</a>
 */
public class NO599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = null;
//        Set<String> set = Set.of(list1);
        List<String> list = List.of(list1);
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (list.contains(list2[i])) {
                if (Math.abs(list.indexOf(list2[i]) + i) < minSum) {
                    minSum = list.indexOf(list2[i]) + i;
                    res = new ArrayList<>();
                    res.add(list2[i]);
                } else if (Math.abs(list.indexOf(list2[i]) + i) == minSum) {
                    if (res == null) {
                        res = new ArrayList<>();
                    }
                    res.add(list2[i]);
                }
            }

        }
        return res.toArray(new String[0]);
    }

}
