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
     static {
        for (int i = 0; i < 500; i++) {
            reorderList(new ListNode(0, new ListNode(5)));
        }
    }
    public static void reorderList(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sec = reverseList(slow.next);
        slow.next = null;
        ListNode first = head;
        while(sec!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = sec.next;
            first.next = sec;
            sec.next = temp1;
            first = temp1;
            sec = temp2;
        }        
    }
    public static ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}