package reverseListNode;

import leetCode.util.ListNode;

import java.util.*;

public class ReverseListNodeForSpecificRange {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));

        System.out.println(new ReverseListNodeForSpecificRange().reverseKGroup(list1,3));
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmpListNode = head;
        while(tmpListNode.next != null){
            list.add(tmpListNode.val);
            tmpListNode = tmpListNode.next;
        }
        list.add(tmpListNode.val);
        for (int i = 0; i < list.size();) {
            int range = i+k-1;
            if(range<list.size()){
                reverse(list, i, range);
                i = i+k;
            }else{
                break;
            }
        }
        ListNode dummyNode = new ListNode(list.get(0));
        tmpListNode = dummyNode;
        for (int i = 1; i < list.size(); i++) {
            dummyNode.next = new ListNode(list.get(i));
            dummyNode = dummyNode.next;
        }
        return tmpListNode;
    }

    public static void reverse(ArrayList<Integer> numbers, int start, int end) {
        if (start < end) {
            int temp = numbers.get(start);
            numbers.set(start, numbers.get(end));
            numbers.set(end, temp);
            reverse(numbers, start + 1, end - 1);
        }
    }
}
