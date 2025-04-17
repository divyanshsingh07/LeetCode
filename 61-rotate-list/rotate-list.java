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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0 ){
            return head;
        }
        ListNode temp1 = head;
        int count = 1;
        while(temp1.next != null){
            temp1 = temp1.next;
            count++;
        }
        k = k%count;
        if(k==0)return head;
        ListNode pre = head;
        ListNode temp = head;
        for(int i=1;i<count-k+1;i++){
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        temp1.next = head;
        head = temp;

        return head;
    }
}