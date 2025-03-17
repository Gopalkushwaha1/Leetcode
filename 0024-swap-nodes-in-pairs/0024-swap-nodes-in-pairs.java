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
    public void swap(ListNode n1 , ListNode n2 ) {
        int temp = n1.val ; 
        n1.val = n2.val ; 
        n2.val = temp ; 
    }
    public ListNode swapPairs(ListNode head) {
        if( head == null || head.next == null ) return head ; 
        ListNode n1 = head ; 
        ListNode n2 = head.next ;

        while ( n1 != null && n2 != null ) {
            swap ( n1 , n2 ) ; 
            n1 = (n1.next.next) == null ? null : n1.next.next ; 
            n2 = (n2.next) == null ? null : n2.next.next; 
        } 
        return head ; 
    }
}