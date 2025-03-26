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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1) ;
        ListNode big = new ListNode(-1) ; 
        ListNode big1 = big ;
        ListNode less1 = less ; 

        while ( head != null ) {
            if ( head.val < x ) {
                less.next = head ;
                less = head ; 
                head = head.next ; 
            }
            else {
                big.next = head ; 
                big = head ; 
                head = head.next ; 
            }
        }
        big.next = null ; 

        less.next = big1.next ;

        return less1.next ; 
    }
}