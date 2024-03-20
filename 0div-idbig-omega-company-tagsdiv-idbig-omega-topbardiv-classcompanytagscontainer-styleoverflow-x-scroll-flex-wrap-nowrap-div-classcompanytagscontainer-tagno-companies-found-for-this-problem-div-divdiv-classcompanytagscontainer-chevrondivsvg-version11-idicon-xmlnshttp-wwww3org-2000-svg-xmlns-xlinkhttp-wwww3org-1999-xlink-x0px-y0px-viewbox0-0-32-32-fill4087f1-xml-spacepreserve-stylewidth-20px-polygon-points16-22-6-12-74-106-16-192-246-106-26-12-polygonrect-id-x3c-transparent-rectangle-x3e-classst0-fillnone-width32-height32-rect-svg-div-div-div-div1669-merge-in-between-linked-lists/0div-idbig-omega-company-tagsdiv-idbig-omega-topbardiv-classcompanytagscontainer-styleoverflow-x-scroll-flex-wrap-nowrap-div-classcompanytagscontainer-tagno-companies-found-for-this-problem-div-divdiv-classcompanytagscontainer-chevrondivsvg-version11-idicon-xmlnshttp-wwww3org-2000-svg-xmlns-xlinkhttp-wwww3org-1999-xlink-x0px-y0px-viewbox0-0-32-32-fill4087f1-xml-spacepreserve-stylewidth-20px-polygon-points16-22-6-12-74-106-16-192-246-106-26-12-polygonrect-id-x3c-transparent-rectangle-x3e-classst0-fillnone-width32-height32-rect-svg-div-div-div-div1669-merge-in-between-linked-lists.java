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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1 = list1;
        ListNode r1 = list1;
        ListNode temp1 = list1;
        while(temp1 != null){
            if(a>1){
                l1 = l1.next;
                a--;
            }
            if(b>=0){
                r1 = r1.next;
                b--;
            }
            temp1 = temp1.next;
        }
        ListNode temp2 = list2;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = r1;
        l1.next = list2;
        return list1;
    }
}