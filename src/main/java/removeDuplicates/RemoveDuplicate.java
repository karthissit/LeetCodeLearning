package removeDuplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        //int[] arr = {1,1,2};
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new RemoveDuplicate().removeDuplicates(arr));
    }

    public int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[j])
                nums[++j] = nums[i];
        }

        return j+1;
    }
}
