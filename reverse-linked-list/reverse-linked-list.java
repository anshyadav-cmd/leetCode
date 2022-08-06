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
         Stack<Integer>stack = new Stack<>();
        ListNode start = new ListNode(0);
        ListNode temp = head;
        start.next = head;
        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head != null) {
            head.val = stack.pop();
            head = head.next;
        }
        return start.next;
    }
}