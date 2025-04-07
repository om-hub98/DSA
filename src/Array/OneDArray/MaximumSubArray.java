package Array.OneDArray;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {1};
        int[] arr3 ={5,4,-1,7,8};
        System.out.println("Max Sum of Subarray : "+maxSubArray(arr1));
       //System.out.println("Max Sum of Subarray : "+optimizeMaxSubArray(arr3));

    }
    public static int maxSubArray(int[] arr){
        int len=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int sum = arr[0];
        for(int i=1;i<len;i++){
            //int sum=0;
            //for(int j=i;j<len;j++){
                sum=Math.max(arr[i],sum+arr[i]);
                maxSum= Math.max(sum,maxSum);
            //}
        }
        return maxSum;
    }
    public static int optimizeMaxSubArray(int[] nums) {
        int maxSum = nums[0];  // Initialize max sum with first element
        int currentSum = nums[0];  // Track the sum of the current subarray

        for (int i = 1; i < nums.length; i++) {
            // Either extend the existing subarray or start a new subarray from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
