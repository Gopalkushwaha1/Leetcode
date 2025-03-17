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
        ListNode small = new ListNode(-1) ; 
        ListNode smallAns = small ; 
        ListNode big = new ListNode(-1) ; 
        ListNode bigAns = big ; 

        while ( head != null ) {
            if ( head.val < x ) {
                small.next = head ; 
                small = head ; 
                head = head.next ; 
            }
            else {
                big.next = head ; 
                big = head ; 
                head = head.next ; 
            }
        }
        big.next = null ;
        small.next = bigAns.next ; 
        return smallAns.next ; 
    }
}