package removeElement;

import java.util.*;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(new RemoveElementFromArray().removeElement(arr, val));
    }

    private int removeElement(int[] arr, int val){
        List<Integer> intList = new LinkedList<>();
        for (int j : arr) {
            intList.add(j);
        }
        intList.removeIf(tmp -> tmp == val);
        for (int i = 0; i < intList.size(); i++) {
            arr[i] = intList.get(i);
        }
        return intList.size();
    }
}
