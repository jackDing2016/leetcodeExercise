package bookExercise.algorithmFourth.common;

public class Node {

    public String key;
    public String value;

    public Node(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Node() {
    }

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Node next;
}
