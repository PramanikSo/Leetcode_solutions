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
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode curr=head.next;
        ListNode prev=head;
        while(curr!=null){
            if(curr.val<=first.val){
                if(head.val>curr.val){
                    ListNode temp=new ListNode(curr.val);
                    temp.next=head;
                    head=temp;
                }else{
                    ListNode temp=head;
                    while(temp.val<=curr.val){
                        if(temp.next.val>=curr.val){
                            break;
                        }
                        temp=temp.next;
                    }
                    ListNode t=new ListNode(curr.val);
                    ListNode nxt=temp.next;
                    temp.next=t;
                    t.next=nxt;
                }
                prev.next=curr.next;
                curr=prev.next;
            }else{
                first=curr;
                prev=curr;
                curr=curr.next;
            }

        }
        return head;
        
    }
}