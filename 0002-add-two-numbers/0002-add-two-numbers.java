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
        ListNode dummy = new ListNode(-1) ;
        ListNode dum = dummy ; 

        int carry = 0 ; 

        while ( l1 != null || l2 != null ) {
            int val1 = l1 == null ? 0 : l1.val ;
            int val2 = l2 == null ? 0 : l2.val ; 

            int sum = val1 + val2 + carry ;
            carry = sum/10;
            int rem = sum % 10 ; 

            dummy.next = new ListNode(rem) ;
            dummy = dummy.next ; 

            l1 = l1 == null ? l1 : l1.next ;
            l2 = l2 == null ? l2 : l2.next ; 

        }
        if ( carry > 0 ) {
            dummy.next = new ListNode(carry) ; 
        }

        return dum.next ; 
    }
}