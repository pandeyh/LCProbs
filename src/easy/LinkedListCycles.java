package easy;

import utils.ListNode;

//https://leetcode.com/problems/linked-list-cycle/


public class LinkedListCycles {

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
                return true;

        }

        return false;

    }

    public static  void main(String args[]) {
        ListNode n= new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(4);


        boolean isCyclic = hasCycle(n);

       System.out.print(isCyclic);


    }
}
