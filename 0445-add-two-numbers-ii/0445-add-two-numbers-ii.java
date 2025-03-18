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
    public ListNode reverse(ListNode l ) {
        ListNode prev = null ; 
        ListNode curr = l ; 

        while ( curr != null ) {
            ListNode temp = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = temp ; 
        }

        return prev ; 
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1 = reverse(l1) ; 
        ListNode rev2 = reverse(l2) ;
        ListNode ans = new ListNode() ; 

        int carray = 0 , sum = 0 ; 

        while ( rev1 != null || rev2 != null ) {
            int val1 = rev1 == null ? 0 : rev1.val ; 
            int val2 = rev2 == null ? 0 : rev2.val ; 

            sum += val1 + val2 ; 
            ans.val = sum % 10 ; 
            carray = sum/10 ; 
            ListNode head = new ListNode(carray) ; 
            head.next = ans ; 
            ans = head ; 
            sum = carray ;  

            rev1 = rev1 == null ? rev1 : rev1.next ; 
            rev2 = rev2 == null ? rev2 : rev2.next ; 

        } 
        return carray == 0 ? ans.next : ans  ; 
    }
}