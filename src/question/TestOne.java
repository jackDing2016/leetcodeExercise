package question;

import question.common.ListNode;
import question.common.TreeNode;

import java.util.*;

public class TestOne {

    public int search(int[] nums, int target) {
        int pivot;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (target == nums[pivot]) return pivot;
            else if (target < nums[pivot]) {
                right = pivot;

            } else left = pivot;
        }
        return -1;
    }

    public void moveZeroes(int[] nums) {
        int lastNonZeroEleIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroEleIndex] = nums[i];
                lastNonZeroEleIndex++;
            }
        }
        for (int i = lastNonZeroEleIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSize = 0;
        int currentMaxSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) currentMaxSize++;
            else {
                if (currentMaxSize > maxSize) maxSize = currentMaxSize;
                currentMaxSize = 0;
            }
        }
        return Math.max(currentMaxSize, maxSize);
    }

    public void duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index >= arr.length) break;
            newArr[index] = arr[i];
            if (arr[i] == 0) {
                index++;
            }
            index++;
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 1 2 3 6 0 0
     * 1 5
     * 1 1 2 3 5 6
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int indexNums1 = 0;
        int indexNums2 = 0;

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);
        }
        return set.stream().toList();
    }

    /**
     * 1 2 3 8 6
     * 8
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

        }
        return 0;
    }

    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
//        int len = Math.max( aLen, bLen );
        String res = "";
        boolean isHaveJinwei = false;
        for (int i = aLen - 1; i >= 0; i--) {
            char x = a.charAt(i), y = b.charAt(i);
            char appendChar;
            if (x == 0 && y == 0) {
                appendChar = 0;
            } else if ((x == 1 && y == 0) || (x == 0 && y == 1)) {
//                appendChar
            }
        }
        return null;
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    /**
     * recursion solution
     *
     * @param s
     */
    public void reverseString2(char[] s) {
        exchangeHelper(s, 0, s.length - 1);
    }

    public void exchangeHelper(char[] s, int aIndex, int bIndex) {
        if (aIndex >= bIndex) return;
        char temp = s[aIndex];
        s[aIndex] = s[bIndex];
        s[bIndex] = temp;
        exchangeHelper(s, aIndex + 1, bIndex - 1);
    }

    public ListNode swapPairs(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        return null;
    }


    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
            }
        }
        return res;
    }

    public void rotate(int[] nums, int k) {

        int[] x = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            x[i] = nums[(nums.length - k % nums.length + i) % nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = x[i];
        }

        System.out.println(Arrays.toString(nums));

    }

    /**
     * 0 1
     * 1 2
     * 2 3
     * 3 4
     * 4 5
     * . .
     * . .
     * . .
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {

        return null;
    }

    /**
     * 1 1 2 3 5 8 13 21 34 55 89 144
     *
     * @param n
     * @return
     */
    public int fibonacciNum(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacciNum(n - 1) + fibonacciNum(n - 2);
    }


    public int arrayPairSum(int[] nums) {

        return 0;
    }

    public void wallsAndGates(int[][] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

            }
        }
    }

    public int mySqrt(int x) {
        return 0;
    }

    public int[] searchRange(int[] nums, int target) {
        return null;
    }

    public int getSumOfLevel(int level) {
        return sumOfLevelHelper(5, 5);
    }

    public int sumOfLevelHelper(int i, int j) {
        if ((i - 1) == 0 || (j - 1) == 0) return 1;
        return sumOfLevelHelper(i - 1, j - 1) + sumOfLevelHelper(i - 1, j);
    }

    public ListNode reverseList(ListNode head) {

        return null;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversalHelper(root, res);
        return res;
    }

    public void preorderTraversalHelper(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        preorderTraversalHelper(node.left, list);
        preorderTraversalHelper(node.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversalHelper(root, res);
        return res;
    }

    public void inorderTraversalHelper(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraversalHelper(node.left, list);
        list.add(node.val);
        inorderTraversalHelper(node.right, list);
    }

    public int maxDepth(TreeNode root) {
        return maxDepthRecursionHelper(root);
    }

    public int maxDepthRecursionHelper(TreeNode node) {
        if (node == null) return 0;
        else return Math.max(maxDepthRecursionHelper(node.left), maxDepthRecursionHelper(node.right)) + 1;
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricRecurisonHelper(root.left, root.right);
    }

    public boolean isSymmetricRecurisonHelper(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            return (left.val == right.val)
                    && isSymmetricRecurisonHelper(left.left, right.right)
                    && isSymmetricRecurisonHelper(right.left, left.right);
        } else {
            return left == null && right == null;
        }
    }

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> set = new HashSet<>();

        int sum = 0;
        for ( int i = 0; i < jewels.length(); i++ ) {
            set.add( jewels.charAt(i) );
        }

        for ( int i = 0; i < stones.length(); i++ ) {
            if ( set.contains( stones.charAt(i) ) ) sum+=1;
        }
        return sum;
    }

    public int[] mergeSort( int[] input ) {
        int middleIndex = input.length / 2;
        return null;
    }

    public int[] mergeSortHelper( int[] leftData, int[] rightData ) {
        int leftDataPivot = 0, rightDataPivot = 0;
        int[] res = new int[leftData.length + rightData.length];
        for ( int i = 0; i < res.length; i++ ) {
            if ( leftData[leftDataPivot] <= rightData[rightDataPivot] ) {
                res[i] = leftData[leftDataPivot];
                leftDataPivot += 1;
            }
            else {
                res[i] = rightData[rightDataPivot];
                rightDataPivot += 1;
            }
        }
        return res;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length;
        int y = matrix[0].length;

        int pivotX = x / 2;
        int pivotY = y / 2;

        return searchMatrixRecursionHelper(
                copyArray(matrix, 0, pivotX, 0, pivotY),
                copyArray(matrix, pivotX + 1, x - 1, 0, pivotY),
                copyArray(matrix, 0, pivotX, pivotY + 1, y - 1),
                copyArray(matrix, pivotX + 1, x - 1, pivotY + 1, y - 1),
                target
        );

    }

    public int[][] copyArray( int[][] source, int xStart, int xEnd, int yStart, int yEnd ) {
        int[][] res = new int[xEnd - xStart][yEnd - yStart];
        for ( int i = xStart; i <= xEnd; i++ ) {
            for ( int j = yStart; j <= yEnd; j++ ) {
                res[i][j] = source[i][j];
            }
        }
        return res;
    }


    public boolean searchMatrixRecursionHelper(int[][] matrix1,
                                               int[][] matrix2,
                                               int[][] matrix3,
                                               int[][] matrix4,
                                               int target) {
        if ( target == getMinValue(matrix1)
                || target == getMinValue(matrix2)
                || target == getMinValue(matrix3)
                || target == getMinValue(matrix4)
        ) {
            return true;
        }
        else {
            if ( target > getMinValue(matrix1) && target < getMaxValue(matrix1) ) {
                searchMatrix( matrix1, target );
            }
            if ( target > getMinValue(matrix2) && target < getMaxValue(matrix2) ) {
                searchMatrix( matrix2, target );
            }
            if ( target > getMinValue(matrix3) && target < getMaxValue(matrix3) ) {
                searchMatrix( matrix3, target );
            }
            if ( target > getMinValue(matrix4) && target < getMaxValue(matrix4) ) {
                searchMatrix( matrix4, target );
            }
        }
        return false;
    }
    public int getMinValue( int[][] matrix ) {
        return matrix[0][0];
    }
    public int getMaxValue( int[][] matrix ) {
        return matrix[matrix.length-1][matrix[0].length-1];
    }

    public int deleteAndEarn(int[] nums) {

        HashMap<String, String> x = new HashMap<>();
//        x.getOrDefault();

        return 0;
    }

    public boolean isValidBST(TreeNode root) {
        if ( root == null ) return true;
        return isValidBSTHelper( root.val, root.left, "left" )
                && isValidBSTHelper( root.val, root.right, "right" );
    }

    public boolean isValidBSTHelper( int rootVal, TreeNode node, String sign ) {
        if ( node == null ) return true;
        else if ( sign.equals( "left" ) ) {
            if ( rootVal > node.val ) {
                return isValidBSTHelper( node.val, node.left, "left" )
                 && isValidBSTHelper( node.val, node.right, "right" );
            }
            else {
                return false;
            }
        }
        else if ( sign.equals( "right" ) ) {
            if ( node.val > rootVal ) {
                return isValidBSTHelper( node.val, node.left, "left" )
                && isValidBSTHelper( node.val, node.right, "right" );
            }
            else {
                return false;
            }
        }
        return false;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if ( root == null ) return null;
        if ( val == root.val ) return root;
        else if ( val < root.val ) return searchBST( root.left, val );
        else return searchBST( root.right, val );
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        return null;
    }

    public String addSpaces(String s, int[] spaces) {
        char[] chars = new char[s.length() + spaces.length];
        int sPoint = 0 , spacesPoint = 0;
        for ( int i = 0; i < chars.length; i++ ) {
            if ( spacesPoint < spaces.length && spaces[spacesPoint] == sPoint ) {
                chars[i] = ' ';
                spacesPoint++;
            }
            else {
                chars[i] = s.charAt( sPoint );
                sPoint++;
            }
        }
        return new String(chars);
    }

    public int climbStairs(int n) {
        return 0;
    }

    public int findMinDifference(List<String> timePoints) {
        
        return 0;
    }

    public void bubbleSort( int[] arr ) {

        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr.length - i - 1; j++ ) {
                if ( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public boolean canPartition(int[] nums) {
        // calculate sum of nums
        int sum = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            sum += nums[i];
        }
        if ( sum % 2 == 1 ) return false;
        int subSum = sum / 2;

        return false;
    }

    public int maxVowels(String s, int k) {
        return 0;
    }

    public Integer[] numsSameConsecDiff(int n, int k) {
        List<Integer> resList = new ArrayList<>();
        for ( int i = 1; i < 10; i++ ) {
            for ( int j = 1; j < n; j = j + 2 ) {
                StringBuffer sb = new StringBuffer();

                if ( ( k + i < 10 ) || ( i - k > 0 )  ) {
                    sb.append(i);
                    sb.append( Math.abs( k + i ) );
                    resList.add( Integer.valueOf( sb.toString() ) );
                }


            }
        }
        return resList.toArray(new Integer[0]);
    }

    /**
     * [-1,0,3,5,9,12]
     * 9
     *
     * @param args
     */
    public static void main(String[] args) {

//        int[] arr = {
//                7,12,9,1,6,9
//        };
//        new TestOne().bubbleSort(arr);
//        System.out.println( Arrays.toString(arr) );

        System.out.println( new TestOne().numsSameConsecDiff( 3, 7 ) );

//        String s = "icodeinpython";
//        int[] spaces = {
//                1,5,7,9
//        };
//        System.out.println(new TestOne().addSpaces(s, spaces));
//        System.out.println(1 / 2);

//        int[] a = new int[]{
//                -1, 0, 3, 5, 9, 12
//        };
//
//        System.out.println( new TestOne().search( a, 9 ) );

//        int[] a = new int[] {
//                0,1,0,3,12
//        };
//
//        new TestOne().moveZeroes( a );

//        int[] a = new int[] {
//          1,0,1,1,0,1
//        };
//        new TestOne().duplicateZeros(a);

//        int[] a = new int[] {
//                1,2,3,4,5,6,7
//        };
//        new TestOne().rotate(a, 3);

//        System.out.println( new TestOne().fibonacciNum( 9 ) );
//        System.out.println(new TestOne().getSumOfLevel(5));

    }


}

