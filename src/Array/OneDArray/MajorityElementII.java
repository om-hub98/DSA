package Array.OneDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums= {3,2};
        List<Integer> list = majorityElement(nums);
        System.out.println("Result : ");
        for(int i : list){
            System.out.print(i+", ");
        }
    }

    public static List<Integer> majorityElement(int[] nums) {
        int len=nums.length;
        int minAppear=len/3;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int count=1;
        if(len==1)list.add(nums[0]);
        for(int index=0;index<len-1;index++){
            if(nums[index]==nums[index+1]){
                count++;
            }
            else {
                if(count > minAppear) {
                    list.add(nums[index]);
                }
                count=1;
            }
        }
        if(count > minAppear){
            list.add(nums[len-1]);
        }
        return list;
    }
}
