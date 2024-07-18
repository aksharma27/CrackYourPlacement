package July;

import java.util.ArrayList;
import java.util.List;

public class PalindromeList {
    static class Node {
        Node next;
        int data;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node tw = new Node(2);
        Node th = new Node(2);
        Node fr = new Node(1);
        head.next = tw;
        tw.next = th;
        th.next = fr;

        System.out.println(palindromeCheck(head));
    }

    static boolean palindromeCheck (Node head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.data);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
}
