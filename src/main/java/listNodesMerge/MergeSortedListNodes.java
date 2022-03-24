package listNodesMerge;

import leetCode.util.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedListNodes {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        ListNode[] listArray = new ListNode[3];
        listArray[0] = list1;
        listArray[1] = list2;
        listArray[2] = list3;

        ListNode[] arr = new ListNode[0];
        System.out.println(new MergeSortedListNodes().mergeKLists(arr));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode finalList = new ListNode();
        if (lists == null || lists.length == 0)
            return null;
        ArrayList<ListNode> listNodes = new ArrayList<>();
        for (ListNode list : lists) {
            if(list!= null){
                listNodes.add(list);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode head : listNodes) {
            if (head != null){
                ListNode tmpListNode = head;
                while(tmpListNode.next != null){
                    list.add(tmpListNode.val);
                    tmpListNode = tmpListNode.next;
                }
                list.add(tmpListNode.val);
            }else{
                list.add(null);
            }
        }

        list.sort(Integer::compareTo);

        System.out.println(list);

        if(list.size()!=0){
            ListNode dummyNode = new ListNode(list.get(0));
            finalList = dummyNode;
            for (int i = 1; i < list.size(); i++) {
                dummyNode.next = new ListNode(list.get(i));
                dummyNode = dummyNode.next;
            }
        }

        return finalList;
    }
}
