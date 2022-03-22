package threesum;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum sum  = new ThreeSum();
        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr1 = {0,0,0};

        System.out.println(sum.threeSum(arr));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> integerSet = new HashSet<>();
        if(nums.length ==0 || (nums.length == 1 && nums[0] == 0) || (nums.length == 2 && nums[0] == 0)){
            return Collections.EMPTY_LIST;
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp1 = -nums[i];
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[i] == nums[j] && nums[i]!=0){
                    continue;
                }
                if(tmp1+nums[j]+nums[j +1] == 0) {
                    integerSet.add(Arrays.asList(tmp1,nums[j],nums[j+1]));
                }
            }

        }
        return integerSet.stream().toList();
    }
}
