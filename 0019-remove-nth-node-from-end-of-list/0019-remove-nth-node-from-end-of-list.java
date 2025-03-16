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
        if ( head.next == null ){
             head = null ; 
             return head ; 
        }
        int count = 0 ; 
        ListNode temp = head ; 
        while ( temp != null ) {
            count++ ; 
            temp = temp.next ; 
        }
        if ( n == count ) {
            head = head.next ; 
            return head ; 
        }
        int req = count - n - 1 ;
        temp = head ; 
        while ( req != 0 ) {
            temp = temp.next ; 
            req--;
        } 
        temp.next = temp.next.next ; 

        return head ; 

    }
}