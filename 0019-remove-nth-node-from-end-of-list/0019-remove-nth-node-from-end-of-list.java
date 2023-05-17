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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode();
        dummy.next= head;
        ListNode F=dummy;
        ListNode S=dummy;
        
         for(int i=1; i<=n; ++i)
             F=F.next;
    
         while(F.next!=null){
            F=F.next;
             S=S.next;
         }
        S.next=S.next.next;
        return dummy.next;

    }
}