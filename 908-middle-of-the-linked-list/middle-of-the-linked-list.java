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
        if (head == null || head.next == null) return head;

        // size of ll
        int size = 0;
        ListNode temp = head;
       while (temp != null) {
            size++;
            temp = temp.next;
        }

        int mid=size/2;
        temp=head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }  
        return temp;
    }
   
}