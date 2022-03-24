package swapinpairs;

import leetCode.util.ListNode;

public class SwapInPairs {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.println(new SwapInPairs().swapPairs(listNode));
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNode tmpNode = head;
        ListNode dummyhead = tmpNode;

        while (tmpNode.next!=null){

        }

        ListNode tmp = head;
        ListNode tmp2 = head.next;
        ListNode tmp3 = tmp2.next;
        tmp.next = null;
        tmp2.next = null;
        ListNode swap = tmp2;
        tmp2=tmp;
        tmp=swap;
        tmp2.next = tmp3;
        tmp.next = tmp2;


        return tmp;

    }
}
