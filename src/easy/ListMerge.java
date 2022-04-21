package easy;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class ListMerge {


        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode n = new ListNode();

            ListNode temp = n;

            while(list1 != null && list2 != null){

                if(list1.val <= list2.val) {
                    temp.next = list1;
                    list1= list1.next;
                }
                else{
                    temp.next = list2;
                    list2 = list2.next;
                }

                temp = temp.next;
            }

            if(list1 != null)
                temp.next = list1;

            if(list2 != null )
                temp.next  = list2;
            
            return n.next;
        }


        public static  void main(String args[]) {
            ListNode n= new ListNode(1);
            n.next = new ListNode(2);
            n.next.next = new ListNode(4);

            ListNode n1= new ListNode(1);
            n1.next = new ListNode(3);
            n1.next.next = new ListNode(4);

            ListNode l = mergeTwoLists(n, n1);

            while(l != null){
                System.out.print(l.val);
                l = l.next;
            }


        }

}
