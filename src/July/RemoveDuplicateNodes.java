package July;

public class RemoveDuplicateNodes {
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
        ListNode ans = removeDuplicates(head);
        ListNode tem = ans;
        while (tem != null) {
            System.out.print(tem.val + "=>");
            tem = tem.next;
        }
    }

    static ListNode removeDuplicates (ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            ListNode dum = temp;
            while (dum != null && dum.val == temp.val) dum = dum.next;
            temp.next = dum;
            temp = temp.next;
        }
        return head;
    }
}
