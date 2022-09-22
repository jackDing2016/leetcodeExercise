package question;


public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        head = new Node();
    }

    public int get(int index) {
        Node currentNode = head.next;
        int currentIndex = 0;
        while ( currentNode != null) {
            currentNode = currentNode.next;
            if ( currentIndex == index ) return currentNode.val;
            currentIndex++;
        }
        return 0;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(getSize(), val);
    }

    public void addAtIndex(int index, int val) {
        Node nodeOfAddAfter = head;
        int currentIndex = 0;
        while ( nodeOfAddAfter != null) {
            if ( currentIndex == index ) {
                Node newNode = new Node();
                newNode.val = val;
                Node oldNextNode = nodeOfAddAfter.next;
                nodeOfAddAfter.next = newNode;
                if ( oldNextNode != null ) {
                    newNode.next = oldNextNode;
                }
                break;
            }
            nodeOfAddAfter = nodeOfAddAfter.next;
            currentIndex++;
        }
    }

    public void deleteAtIndex(int index) {
        Node nodeOfDeleteAfter = head;
        int currentIndex = 0;
        while ( nodeOfDeleteAfter != null ) {
            if ( currentIndex == index ) {
                nodeOfDeleteAfter.next = nodeOfDeleteAfter.next.next;
                break;
            }
            nodeOfDeleteAfter = nodeOfDeleteAfter.next;
            currentIndex++;
        }
    }

    public void traversal() {
        Node node = head.next;
        while (node != null) {
            System.out.println( node.val );
            node = node.next;
        }
    }

    protected int getSize() {
        int size = 0;
        Node node = head;
        while (node.next != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    class Node {
        private int val;
        private Node next;
        public Node() {

        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0, 2);
        myLinkedList.addAtIndex( 1, 3 );

        myLinkedList.addAtHead(5);
        myLinkedList.addAtTail(10);
//        myLinkedList.get(0);

        myLinkedList.traversal();

        myLinkedList.deleteAtIndex( 0 );
        myLinkedList.traversal();

    }

}
