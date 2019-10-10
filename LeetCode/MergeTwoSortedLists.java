/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {    
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode head;
        ListNode temp1;
        ListNode temp2;
        
        if(l1.val<=l2.val){
            head = l1;
            temp1 = head.next;
            temp2 = l2;
        }else{
            head = l2;
            temp1 = l1;
            temp2 = head.next;
        }
        ListNode tail = head;
        
        while(temp1!=null && temp2!=null){
            if(temp1.val <= temp2.val){
                tail.next = temp1;
                temp1 = temp1.next;
            }else{
                tail.next = temp2;
                temp2 = temp2.next;
            } 
            tail = tail.next;
        }
        
        if(temp1==null) tail.next = temp2;
        if(temp2==null) tail.next = temp1;

        return head;
    }
}
