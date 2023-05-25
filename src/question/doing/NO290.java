package question.doing;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href=https://leetcode.com/problems/word-pattern/><Go to Quest</a>
 */
public class NO290 {

    public boolean wordPattern(String pattern, String s) {
        return check(pattern, s);
    }

    private boolean check(String pattern, String s) {
        Map<Character, String> auxMap = new HashMap<>();
        if (s.equals("") && pattern.equals("")) return true;
        if (s.equals("") && !pattern.equals("")) return false;
        if (!s.equals("") && pattern.equals("")) return false;
        String[] arrS = s.split(" ");
        if (arrS.length != pattern.length()) return false;
        for (int i = 0; i < arrS.length; i++) {
            Character cPattern = pattern.charAt(i);
            String str = arrS[i];
            if (!auxMap.containsKey(cPattern)) {
                if (auxMap.containsValue(str)) return false;
                auxMap.put(cPattern, str);
            } else if (!auxMap.get(cPattern).equals(str)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
