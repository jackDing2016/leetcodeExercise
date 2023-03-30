package question.pass;

/**
 * <a href=https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/>Go to Quest</a>
 */
public class NO28 {

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            int z = i;
            for (int j = 0; j < needle.length() && z < haystack.length(); j++) {
                char n = needle.charAt(j), h = haystack.charAt(z);
                if (n != h) {
                    break;
                } else {
                    if (j == needle.length() - 1) return i;
                    z++;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
//        System.out.println(new NO28().strStr("leetcode", "leeto"));
//        System.out.println(new NO28().strStr("sadbutsad", "sad"));
//        System.out.println(new NO28().strStr("hello", "ll"));
//        System.out.println(new NO28().strStr("mississippi", "issi"));
        System.out.println(new NO28().strStr("mississippi", "issipi"));

    }

}
