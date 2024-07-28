/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Get the length of the list
        int length = getLength(head);

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int size = 1; size < length; size *= 2) {
            ListNode curr = dummy.next;
            ListNode tail = dummy;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, size);
                curr = split(right, size);

                tail = merge(left, right, tail);
            }
        }

        return dummy.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    private ListNode split(ListNode head, int size) {
        ListNode tail = head;
        while (--size > 0 && tail != null) {
            tail = tail.next;
        }
        if (tail == null) {
            return null;
        }
        ListNode second = tail.next;
        tail.next = null;
        return second;
    }

     private ListNode merge(ListNode left, ListNode right, ListNode tail) {
        ListNode curr = tail;
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        curr.next = (left != null) ? left : right;

        // Move to the end of the merged list
        while (curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }
}