package question.pass;

/**
 * <a href=https://leetcode.com/problems/length-of-last-word/>Go to Quest</a>
 */
public class NO58 {

    public int lengthOfLastWord(String s) {
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                int res = 0;
                while ((i - res) > -1 && s.charAt(i - res) != ' ') {
                    res++;
                }
                return res;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new NO58().lengthOfLastWord("Hello World"));
        System.out.println(new NO58().lengthOfLastWord("fly me   to   the moon"));
        System.out.println(new NO58().lengthOfLastWord("luffy is still joyboy"));
        System.out.println(new NO58().lengthOfLastWord("a"));

    }

}
