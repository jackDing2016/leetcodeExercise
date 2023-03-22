package question;

public class NO9PalindromeNumber {

    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        boolean res = true;
        for ( int i = 0; i < a.length() / 2; i++ ) {
            if ( a.charAt(i) != a.charAt(a.length() - i - 1) ) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }

}

