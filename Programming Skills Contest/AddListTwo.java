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
        ListNode temp=new ListNode();
        ListNode r1=reverseList(l1);
        ListNode r2=reverseList(l2);
        ListNode head = temp;
        int carry=0;
        while(r1 !=null || r2!=null || carry !=0){
            int value=carry;
            if(r1!=null){
                value +=r1.val;
                r1=r1.next;
            }
            if(r2!=null){
                value +=r2.val;
                r2=r2.next;
            }
            head.next=new ListNode(value%10);
            carry = value/10;
            head=head.next;
        }
        return head;
    }
    public ListNode reverseList(ListNode head){
        ListNode temp;
        ListNode prev=null;
        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}
