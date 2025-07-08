/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        //if cycle detect
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;

            if(s==f){
            ListNode start=head;
            while(start!=s){
                start=start.next;
                s=s.next;
            }
            return start;
        }

    }
    return null;
        
        
    }
}