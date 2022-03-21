package removeNthFromEnd;

import leetCode.util.ListNode;
import listAlgorithms.SortAndMergeListNodes;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(list1, 2));
    }
    public ListNode removeNthFromEnd(ListNode l1, int n) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int tmp = 0;
        while(l1 != null ){
            if(tmp == n){
                curr.next = curr.next.next;
            }
            curr.next = l1;
            l1 = l1.next;
            tmp++;
        }

        return dummy.next;
    }
}
