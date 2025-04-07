package Array.OneDArray;

/**
 * @author omraj
 */
public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        //System.out.println("Number of ways to split array : "+waysToSplitArray(nums));

        Demo demo1 = new Demo();
        demo1.num=5;
        System.out.println("Num : "+demo1.num);
        System.out.println("Num print : "+demo1.print());
    }
    public static int waysToSplitArray(int[] nums) {
        int len=nums.length;
        int count=0;
        long leftSum=0;
        long rightSum=0;
        for(int n:nums) rightSum+=n;
        for(int index=0; index < len-1; index++){
            leftSum += nums[index];
            rightSum -= nums[index];
            if(leftSum >= rightSum) count++;
        }
        return count;
    }
}
class Demo{
    static int num = 10;

    public Demo(){}
    public Demo(int num){this.num=num;}

    public int print() {
        num = 4;
        return num;
    }
}
