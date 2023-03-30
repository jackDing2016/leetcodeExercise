package question.pass;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href=https://leetcode.com/problems/contains-duplicate/>Go to Quest</a>
 */
public class NO217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> auxSet = new HashSet<>();
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (!auxSet.add(nums[i])) {
                res = true;
                break;
            }
        }
        return res;
    }
}
