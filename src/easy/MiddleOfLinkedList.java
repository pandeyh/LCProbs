package easy;

import utils.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=study-plan&id=algorithm-i
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(slow != null && fast!= null && slow.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}
