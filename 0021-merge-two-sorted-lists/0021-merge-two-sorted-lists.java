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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1 ; 
        ListNode l2 = list2 ; 
        ListNode ans = new ListNode(-1) ; 
        ListNode result = ans ; 

        while ( l1 != null && l2 != null ) {
            if ( l1.val < l2.val ) {
                ans.next = l1 ; 
                ans = ans.next ; 
                l1 = l1.next ; 
            }
            else {
                ans.next = l2 ; 
                ans = l2 ; 
                l2 = l2.next ; 
            }
        }
        if ( l1 != null ) {
            ans.next = l1 ; 
        }
        if ( l2 != null ) {
            ans.next = l2 ; 
        }
        return result.next ; 
    }
}