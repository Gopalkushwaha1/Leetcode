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
        ListNode i = list1 ; 
        ListNode j = list2 ; 
        ListNode k = new ListNode(-1) ; 
        ListNode temp = k ; 

        while ( i != null && j != null ) {
            if(i.val <= j.val ) {
                k.next = i ; 
                i = i.next ; 
            }
            else {
                k.next = j ; 
                j = j.next ; 
            }
            k = k.next ; 
        }
        if(i != null ) {
            k.next = i ; 
        }
        if ( j != null ) {
            k.next = j ; 
        }
        return temp.next ; 
    }
}