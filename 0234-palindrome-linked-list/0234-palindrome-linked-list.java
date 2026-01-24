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
    public ListNode reverse(ListNode head , int len ) {
        ListNode temp = null ; 
        ListNode curr = head ; 
        ListNode prev = head ; 

        int i = 0 ; 

        while ( len != i ) {
            curr = curr.next ; 
            prev.next = temp ; 
            temp = prev ; 
            prev = curr ; 
            i++ ; 
        }
        return prev ; 
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null ) return true ; 
        int len = 0 ; 
        ListNode temp = head ; 

        while ( temp != null ) {
            len++ ; 
            temp = temp.next ; 
        }

        int left = (len/2) - 1  ; 
        int right = 0 ; 

        right = len % 2 == 0 ? len/2 : (len/2) + 1 ; 
        temp = head ; 

        ListNode rightSide = temp ;
        int i = 0 ;  

        while ( i != right ) {
            i++ ; 
            rightSide = temp.next ; 
        } 

        ListNode rev = reverse(head , left ) ; 

        while ( rev != null && rightSide != null ) {
            if(rev.val != rightSide.val) return false ; 
            rev = rev.next ; 
            rightSide = rightSide.next ; 
        }

        return true ; 
    }
}