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
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
         ListNode last=head;
         while(fast!=null && fast.next!=null)
         {
            last=last.next;
            fast=fast.next.next;
            if(fast == last){
                return true;
            }
         }
         return false;
    
    }
}
