package question.pass;

import utils.IntUtils;

/**
 * <a href=https://leetcode.com/problems/move-zeroes/>Go to Quest</a>
 */
public class NO283 {

    public void moveZeroes(int[] nums) {
        int rightPivot = nums.length - 1;
        for (int i = 0; i < nums.length - 1 && i < rightPivot; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < rightPivot; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[rightPivot--] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[] a = {
//                0, 1, 0, 3, 12
//        };

        int[] b = {
                0, 1, 0
        };

        new NO283().moveZeroes(b);

        IntUtils.show(b);

    }

}
