package main.java.leetcode;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode newHead = new ListNode(0);
        ListNode p3 = newHead;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
        if (carry ==1) {
            p3.next = new ListNode(1);
        }
        return newHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        @Override
        public String toString() {
            int l3 = val;
            int l2 = next.val;
            int l1 = next.next.val;
            return String.format("Output: %s%s%s", l1,l2,l3);
        }
    }
}
