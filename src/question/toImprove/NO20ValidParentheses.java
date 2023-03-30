package question.toImprove;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * <a href=https://leetcode.com/problems/valid-parentheses/>Go to Quest</a>
 */
public class NO20ValidParentheses {

    public boolean isValid(String s) {
        boolean isValid = true;
        List<String> outEle = List.of(")","}","]");
        Map<String, String> map = Map.of("(", ")", "{", "}", "[", "]");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String cc = String.valueOf(s.charAt(i));
            if ( outEle.contains(cc) ) {

                if ( stack.size() == 0  ) {
                    isValid = false;
                    break;
                }

                if ( !cc.equals(map.get(stack.pop())) ) {
                    isValid = false;
                    break;
                }
            }
            else {
                stack.push(cc);
            }
        }

        if ( stack.size() > 0) isValid = false;

        return isValid;
    }

    public static void main(String[] args) {

//        String s = "()[]{}";

//        String s = "[";

        String s = "]";

        System.out.println(new NO20ValidParentheses().isValid(s));

    }

}
