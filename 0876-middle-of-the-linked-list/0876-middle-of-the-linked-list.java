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
         ListNode S=head, F=head;
        while(F!=null && F.next!=null){
            S=S.next;
            F=F.next.next;
        }
        return S;
    }
}