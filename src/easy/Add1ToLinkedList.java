package easy;

// Add one to the last node value. It is not about adding another node to the list.
// for ex if list is 1 -> 2 -> 3 After adding one it will be 1 -> 2 -> 4
// or 1 -> 2 -> 9 After adding one it will be 1 -> 2 -> 10


public class Add1ToLinkedList {

    public static ListNode addOneToList(ListNode l) {
        // Write your code here

        ListNode ln = l;
        while(ln.next != null){
            ln = ln.next;
        }
        ln.val = ln.val+1;

        return l;
    }

    public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(9);
        ListNode n = addOneToList(n1);

        while(n != null){
            System.out.print(n.val);
            n = n.next;
        }
    }
}
