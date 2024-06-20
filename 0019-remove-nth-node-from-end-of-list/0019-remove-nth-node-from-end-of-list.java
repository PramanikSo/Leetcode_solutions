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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if (head == null) return null;

        // Calculate the size of the list
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Determine the position to remove from the start (0-indexed)
        n = size - n;
        
        // If we need to remove the head node
        if (n == 0) {
            return head.next;
        }

        // Find the node just before the one we need to remove
        temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }

        // Remove the nth node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}