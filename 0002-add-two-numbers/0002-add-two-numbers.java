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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode curr =dummyHead;
        int x=0,y=0;
        int carry=0;
        while(l1!=null || l2!=null){
            if(l1==null){
                x=0;
            }else{
                x=l1.val;
                l1=l1.next;
            }
            if(l2==null){
                y=0;
            }else{
                y=l2.val;
                l2=l2.next;
            }
            int num = x+y+carry;
            carry=num/10;
            curr.next=new ListNode(num%10);
            curr=curr.next;

        }
        if(carry>0){
            curr.next=new ListNode(1);
        }
        return dummyHead.next;
    }
}