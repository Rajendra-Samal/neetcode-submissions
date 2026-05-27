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
         if (head == null) return null;

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // store next node
            current.next = previous;      // reverse the link
            previous = current;           // move previous forward
            current = next;               // move current forward
        }

        return previous; // new head of reversed list
    }
}
