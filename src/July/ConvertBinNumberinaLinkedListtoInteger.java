package July;

public class ConvertBinNumberinaLinkedListtoInteger {
//    1->0->1 ==> DECIMAL EQUIVALENT is : 5
    static class Node{
        Node next;
        int val;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static int getDecimalValue(Node head) {
        StringBuilder binStr = new StringBuilder();
        while (head != null) {
            binStr.append(head.val);
            head = head.next;
        }
        int ans = Integer.parseInt(binStr.toString(), 2);
        return ans;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node tw = new Node(0);
        Node five = new Node(1);
        head.next = tw;
        tw.next = five;

        System.out.println(getDecimalValue(head));
    }
}
