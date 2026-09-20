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
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        if(head == null){
            return head;
        }
        Stack<ListNode>stack = new Stack<>();
        while(head!= null){
            stack.push(head);
            head = head.next;
        }

        while(!stack.isEmpty()){
         node.next = stack.pop();
         node = node.next;
        }
        node.next = null; // End the reversed list
        return dummy.next;
    }
}
