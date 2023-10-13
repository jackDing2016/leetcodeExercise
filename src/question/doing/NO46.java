package question.doing;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/permutations/>Go to Guest</a>
 */
public class NO46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(new ArrayList<>(), nums, res);
        return res;
    }

    private void helper(List<Integer> list, int[] nums, List<List<Integer>> res) {

        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                helper(list, nums, res);
                list.remove(list.size() - 1);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3
        };
        List<List<Integer>> res = new NO46().permute(arr);
        System.out.println(res);
    }

}
