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
    public ListNode reverseList(ListNode head) {
        ListNode temp = null ; 
        ListNode pointer = head ; 
        ListNode next = head ; 

        while ( pointer != null ) {
            next = pointer.next ; 
            pointer.next = temp ; 
            temp = pointer ; 
            pointer = next ; 
        }
        return temp ; 
    }
}