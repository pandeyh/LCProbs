package easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

import utils.ListNode;

public class RemoveDups {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while(node != null && node.next != null){

            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }

        }


        return head;
    }

    public static void main(String args[]){

        ListNode n = new ListNode(1);
        n.next = new ListNode(1);
        n.next.next = new ListNode(2);

        ListNode newList = new RemoveDups().deleteDuplicates(n);

        while(newList != null){
            System.out.println(newList.val);
            newList = newList.next;
        }

    }
}
