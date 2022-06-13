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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode l1 = list1;
        ListNode l2 = list2;
        
        if(list1.val > list2.val){
            l1 = list2;
            l2 = list1;
        }
        
        ListNode result = l1;
        
        while(l1 != null && l2 != null){
            ListNode temp = null;
            while(l1 != null && l1.val <= l2.val){
                temp = l1;
                l1  = l1.next;
            }
            temp.next = l2;
            ListNode tmpt = l1;
            l1 = l2;
            l2 = tmpt;
            
        }
        return result;
    }
}