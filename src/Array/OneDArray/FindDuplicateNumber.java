package Array.OneDArray;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println("Duplicate number is : "+findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int index=1;index<nums.length;index++){
            if(nums[index-1] == nums[index])
                return nums[index];
        }
        return 0;
    }

}
