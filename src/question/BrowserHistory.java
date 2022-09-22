package question;

import java.util.Stack;

public class BrowserHistory {

    public static Stack<String> historyStack;

//    public int historySize;

    public BrowserHistory(String homepage) {
        if ( historyStack == null ) {
            historyStack = new Stack<>();
        }

    }

    public void visit(String url) {
        historyStack.add( url );
    }

    public String back(int steps) {
        if ( steps >= historyStack.size() ) return historyStack.get(historyStack.size() - 1 );
        return historyStack.get( steps );
    }

    public String forward(int steps) {
        return null;
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.peek();

    }

}
