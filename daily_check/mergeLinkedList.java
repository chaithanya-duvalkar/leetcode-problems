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
        // ListNode NEW=new ListNode(0);
        // ListNode tail=NEW;

        // while(list1!=null && list2!=null)
        // {
        //     if(list1.val<=list2.val)
        //     {
        //         tail.next=list1;
        //         list1=list1.next;
        //     }
        //     else 
        //     {
        //         tail.next=list2;
        //         list2=list2.next;
        //     }

        // }
        // while(list1!=null)
        // {
        //     tail.next=list1;
        // }
        // while(list2!=null)
        // {
        //     tail.next=list2;
        // }
        // return NEW;
          if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Recursive merge
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}