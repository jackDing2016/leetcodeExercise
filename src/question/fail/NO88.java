package question.fail;

/**
 * <a href=https://leetcode.com/problems/merge-sorted-array/>Go to Quest</a>
 */
public class NO88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num2Index = 0;
        for ( int i = 0; i < nums1.length && num2Index < nums2.length; i++ ) {
            if ( nums2[num2Index] < nums1[i] ) {
                for ( int j = nums1.length - 1; j > 0; j-- ) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                }
                nums1[i] = nums2[num2Index];
                num2Index++;
            }
        }
    }

    public static void main(String[] args) {

    }

}
