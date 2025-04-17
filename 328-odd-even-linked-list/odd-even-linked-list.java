/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);

        ListNode l1 = list1;
        ListNode l2 = list2;
        int flag = 0;
        while (head != null) {
            if (flag == 0) {
                l1.next = head;
                l1 = l1.next;
                flag = 1;
            } else {
                l2.next = head;
                l2 = l2.next;
                flag = 0;
            }
            head = head.next;
        }
        l1.next = list2.next;
        l2.next = null;
        return list1.next;
    }
}