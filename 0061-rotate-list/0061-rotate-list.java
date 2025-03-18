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
    public ListNode rotateRight(ListNode head, int k) {
        // if ( head == null || head.next == null ) {
        //     return head ; 
        // }
        int count = 0 ; 

        ListNode temp = head ; 

        while ( temp != null ) {
            count++ ; 
            temp = temp.next ; 
        }
        if ( head == null || head.next == null || k % count == 0  ) {
            return head ; 
        }
        k = k % count ; 
        k = count - k ; 

        temp = head ; 

        while ( k != 1 ) {
            temp = temp.next ; 
            k--;
        }
        ListNode temp2 = temp.next ; 
        temp.next = null ; 

        ListNode dummy =  temp2 ;
        while ( dummy.next != null ) {
            dummy = dummy.next ; 
        }
        dummy.next = head ; 

        return temp2 ; 



    }
}