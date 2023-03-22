package question;

import java.util.Arrays;

public class No1TwoSum {

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(new No1TwoSum().twoSum(a, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{
                            i, j
                    };
            }
        }
        return null;
    }

}
