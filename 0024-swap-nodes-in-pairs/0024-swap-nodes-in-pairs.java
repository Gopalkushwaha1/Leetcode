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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null ;  
        ListNode ptr = head ; 
        ListNode ans = ptr ;

        while ( ptr != null && ptr.next != null ) {
            ListNode temp = ptr.next ; 
            ptr.next = temp.next ; 
            temp.next = ptr ; 
            if ( prev == null ) {
                ans = temp ; 
            }
            if ( prev != null ) {
                prev.next = temp ; 
            }
            prev = ptr ; 
            ptr = ptr.next ; 
        }
        return ans ; 
    }
}