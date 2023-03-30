package question.toImprove;

import java.util.Arrays;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/next-greater-element-i/>Go to Quest</a>
 */
public class NO496NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> b = Arrays.stream(nums2).boxed().toList();
        int[] res = new int[nums1.length];
        for ( int i = 0; i < nums1.length; i++) {
            if ( b.contains(nums1[i]) ) {
                int index = b.indexOf(nums1[i]) + 1;
                if (index > nums2.length - 1) {
                    res[i] = -1;
                }
                else {
                    for ( int j = index; j < nums2.length; j++ ) {
                        if (nums2[j] > nums1[i]){
                            res[i] = nums2[j];
                            break;
                        }
                        res[i] = -1;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {4,1,2};
        int[] b = {1,3,4,2};

        System.out.println(Arrays.toString(new NO496NextGreaterElement().nextGreaterElement(a, b)));

    }
}
