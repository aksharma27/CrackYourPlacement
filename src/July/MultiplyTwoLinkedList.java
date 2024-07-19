package July;

public class MultiplyTwoLinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node h1 = new Node(6);
        Node t = new Node(2);
        h1.next = t;
        Node h2 = new Node(1);
        Node t2 = new Node(0);
        Node t3 = new Node(0);
        h2.next = t2;
        t2.next = t3;

        System.out.println(multiply(h1, h2));
    }

    static int multiply (Node h1, Node h2) {
        int n1 = 0; int n2 = 0;
        while (h1 != null || h2 !=  null){

            if(h1 != null){
                n1 = ((n1)*10) + h1.data;
                h1 = h1.next;
            }

            if(h2 != null)
            {
                n2 = ((n2)*10) + h2.data;
                h2 = h2.next;
            }
        }
        return n1 * n2;
    }
}
