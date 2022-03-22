package container;


import java.util.Set;
import java.util.TreeSet;

public class ContainerWithMoreWater {

    public static void main(String[] args) {
        int[] containerArray = {1,8,6,2,5,4,8,3,7};
        int[] containerArray1 = {7,1};
        System.out.println(new ContainerWithMoreWater().maxArea(containerArray));
    }

    public int maxArea(int[] height) {
        if(height.length == 0){
            return 0;
        }if(height.length==1){
            return height[0];
        }if(height.length==2){
            return 2*height[1];
        }
        TreeSet<Integer> areas = new TreeSet<>();

        for (int i = 1; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int tmp = Math.min(height[i], height[j]);
                areas.add(j*tmp);
            }
        }
        System.out.println(areas);
        return areas.last();
    }
}
