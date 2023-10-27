package medium;

import utils.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = 0;
        ListNode result = new ListNode(0);
        ListNode l = result;
        while(l1 != null || l2 != null || carry != 0){
            sum = l1.val + l2.val;
            carry = carry + sum;
            carry = sum / 10;
            l.next = new ListNode(sum % 10);

            if( l1 != null)
                l1 = l1.next;
           if( l2 != null)
               l2 = l2.next;
        }


        return result.next;
    }


    public static void main(String args[]){
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);

        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(2);
        n2.next.next = new ListNode(4);

        new AddTwoNumbers().addTwoNumbers(n1,n2);
    }
}
