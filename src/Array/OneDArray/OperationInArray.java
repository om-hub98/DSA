package Array.OneDArray;

import java.util.Arrays;

public class OperationInArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,1,1,0};
        nums=applyOperations(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int[] applyOperations(int[] nums) {
        int len=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int[] result=new int[len];
        int index=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0)
                result[index++]=nums[i];
        }
        return result;
    }
}
