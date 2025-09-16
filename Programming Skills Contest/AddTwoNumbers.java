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
        ListNode temp = new ListNode();
        ListNode head=temp;
        int carry=0;
        while(l1 !=null || l2 !=null || carry!=0){
            int value=0;
            if(l1 !=null){
                value=l1.val+carry;
                l1=l1.next;
            }
            if(l2 !=null){
                value=l2.val+carry;
                l2=l2.next;
            }
            temp.next=new ListNode(value%10);
            carry=value/10;
            temp=temp.next;
        }
        return head.next;
    }

}
