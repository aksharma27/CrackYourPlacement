package July;

import java.util.List;

public class RemoveLinkedList {
    static class ListNode {
        ListNode next;
        int val;
        public ListNode (int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode () {
            this.next = null;
//            this.val = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode th = new ListNode(2);
        ListNode fr = new ListNode(3);
        ListNode fv = new ListNode(4);
        ListNode sx = new ListNode(2);
        head.next = two; two.next = th; th.next = fr; fr.next = fv; fv.next = sx;
        ListNode newHead = removeElements(head, 2);
        while (newHead.next != null) {
            System.out.print(newHead.val + "->");
            newHead = newHead.next;
        }
    }

    static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
