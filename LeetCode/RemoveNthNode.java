/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast, slow; 
        fast = head;
        slow = head;
        for(int i = 0; i < n; i++){
            fast = fast.next; 
            //if remove head
            if(fast == null){
                head = head.next;
                return head;
            }
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        } 
        
        if(slow.next.next == null){
            //if remove end
            slow.next = null;
        } else {
            slow.next = slow.next.next; 
        }
       
        return head;
    }
}
