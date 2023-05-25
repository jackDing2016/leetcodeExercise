package question.doing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href=https://leetcode.com/problems/non-decreasing-subsequences/>Go to Quest</a>
 */
public class NO491 {

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        helper(res, new ArrayList<>(), nums, 0);
        return new ArrayList<>(res);
    }

    public void helper(Set<List<Integer>> res, List<Integer> ele, int[] nums, int start) {

        if (ele.size() >= 2) res.add(new ArrayList<>(ele));
        for (int i = start; i < nums.length; i++) {
//            if (ele.size() == 0 || ele.get(ele.size() - 1) <= nums[i]) {
            ele.add(nums[i]);
            helper(res, ele, nums, i + 1);
            ele.remove(ele.size() - 1);
//            }
        }
    }


}
