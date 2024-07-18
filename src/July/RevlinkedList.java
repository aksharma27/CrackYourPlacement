package July;

public class RevlinkedList {
    static class Node {
        Node next;
        int data;
        public Node () {
            this.next = null;
//            this.data = null;
        }
        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node t = new Node(3);
        Node f = new Node(4);
        Node s = new Node(6);
        head.next = t;
        t.next = f;
        f.next = s;

        Node rev = revList(head);
        while (rev != null) {
            System.out.print(rev.data + "->");
            rev = rev.next;
        }
    }



    static Node revList (Node head) {
        Node newHead = null;
        Node nxt;
        while (head != null) {
            nxt = head.next;
            head.next = newHead;
            newHead = head;
            head = nxt;
        }
        return newHead;
    }
}
