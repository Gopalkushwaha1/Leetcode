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
    public ListNode middleNode(ListNode head) {
        if ( head == null || head.next == null ) return head ; 
        int count = 0 ; 
        ListNode temp = head ; 

        while ( temp.next != null ) {
            count++;
            temp = temp.next ; 
        }
        count++;
        System.out.print(count) ; 
        temp = head ;
        count = count/2 ;  
        while ( count != 0 ) {
            temp = temp.next ; 
            count--;
        }
        return temp ; 
    }
}