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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>() ; 

        for ( int num : nums ) {
            set.add(num) ; 
        }

        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy ; 
        ListNode next = head ; 

        while ( head != null ) {
            while(head != null && set.contains(head.val)) {
                head = head.next ; 
                
            }
            if( head != null ) {
                ListNode newNode = new ListNode(head.val) ; 
                curr.next = newNode ; 
                curr = newNode ; 
                head = head.next ; 
            }
        }
        if ( head != null ) {
            head = null ; 
        }
        return dummy.next ; 

    }
}