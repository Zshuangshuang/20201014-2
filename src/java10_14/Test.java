package java10_14;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-14
 * Time:18:49
 **/

class Node{
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class Test {

    public Node head;
    public static Node addFirst(Node head,int e){
        Node node = new Node(e);
        if (head == null){
            head = node;
            return node;
        }
        node.setNext(head);
        head = node;
        return node;
    }

    public static Node addLast(Node head,int e){
        Node node = new Node(e);
        if (head == null){
            head = node;
            return head;
        }
        Node cur = head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
        return head;
    }

    public static Node removeFirst(Node head){
        if (head == null){
            return null;
        }
        head = head.getNext();
        return head;
    }
    public static Node removeLast(Node head){
        if (head == null){
            return null;
        }
        Node cur = head;

        while(cur.getNext() != null){

            cur = cur.getNext();
        }
        cur.setNext(null);
        return head;

    }

}
