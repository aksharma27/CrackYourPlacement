package July;

public class MiddleOfLinkedList {
    static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
// static ListNode head;

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two; two.next = three; three.next = four;
        four.next = five;

        ListNode mid = middle(head);
        System.out.println(mid.val);

    }

    static ListNode middle (ListNode head) {
        ListNode fast = head, slow = head;
//        System.out.println(fast.val);
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
