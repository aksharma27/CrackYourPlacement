package July;
import java.util.*;

public class SortList012 {
    static class Node{
        Node next;
        int data;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node t = new Node(2);
        Node th = new Node(2);
        Node f = new Node(1);
        Node fv = new Node(2);
        Node s = new Node(0);
        Node sv = new Node(2);
        head.next = t; t.next = th; th.next = f; f.next = fv; fv.next = s; s.next = sv;
        Node ans = segregate(head);
        while (ans != null) {
            System.out.print(ans.data + "->");
            ans = ans.next;
        }

    }

    static Node segregate(Node head) {
        // using countings of 0s 1s and 2s :
        int[] count = new int[3];
        Arrays.fill(count, 0);
        while (head != null) {
            if (head.data == 0) {
                count[0]++;
                head = head.next;
            }
            else if (head.data == 1) {
                count[1]++;
                head = head.next;
            }
            else {
                count[2]++;
                head = head.next;
            }
//            head = head.next;
        }

        Node ans = new Node(0);
        Node ansHead = ans;
        if (count[0] != 0) {
            ans.data = 0;
            count[0]--;
        }
//        else if (count[1] != 0) {
//            ans.data = 1;
//            count[1]--;
//        } else {
//            ans.data = 2;
//            count[2]--;
//        }
        while(true) {
            if (count[0] != 0) {
                ans.next = new Node(0);
                ans = ans.next;
                count[0]--;
            } else if(count[1] != 0) {
                ans.next = new Node(1);
                ans = ans.next;
                count[1]--;
            }
            else if (count[2] != 0) {
                ans.next = new Node(2);
                ans = ans.next;
                count[2]--;
            }
            else break;
        }
        return ansHead;
    }

}
