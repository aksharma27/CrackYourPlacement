package July;

import java.util.List;

public class MergeTwoSortedList {
    static class ListNode {
        ListNode next;
        int val;
        public ListNode (int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode (){
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode tw = new ListNode(2);
        ListNode th = new ListNode(4);
        h1.next = tw; tw.next = th;

        ListNode h2 = new ListNode(1);
        ListNode t = new ListNode(3);
        ListNode tr = new ListNode(4);
        h2.next = t;
        t.next = tr;

        ListNode newHead = mergeTwoLists(h2, h2);
        while (newHead != null) {
            System.out.print(newHead.val);
            newHead = newHead.next;
        }
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        ListNode tmp=new ListNode(0);
        ListNode current=tmp;

        while(list1!=null && list2!=null){
            if(list1.val <list2.val){
                current.next=list1;
                list1=list1.next;
            }

            else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
            if(list1==null){
                current.next=list2;
            }
            else
                current.next=list1;

        }return tmp.next;


    }
}
