package Array.OneDArray;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,8,10};
        int[] arr2 = {2,3,9};
        int m=arr1.length;
        int n=arr1.length;

        //mergeArrays(arr1,arr2);
        lcMergeArrays(arr1,arr2,m,n);
    }
    public  static void mergeArrays(int[] nums1, int[] nums2){
        int m=nums1.length;
        int n=nums2.length;

        int newLen=m+n;
        int[] newArr=new int[newLen];
        int index=0;
        for(int i:nums1){
            newArr[index++]=i;
        }
        for(int i:nums2){
            newArr[index++]=i;
        }
        Arrays.sort(newArr);
        for(int i=0; i<newLen-n; i++){
            nums1[i]=newArr[i];
        }
        int index1=0;
        for(int i=m; i<newLen; i++){
            nums2[index1++]=newArr[i];
        }
        System.out.println("Array 1 elemnent");
        print(nums1);
        System.out.println("Array 2 elemnent");
        print(nums2);
    }

    public static void lcMergeArrays(int[] nums1, int[] nums2, int m, int n){
        int left=m-1;
        int right=0;
        while(nums1[left] >= nums2[right]){
            int temp=nums1[left];
            nums1[left]=nums2[right];
            nums2[right]=temp;
            left--;
            right++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        print(nums1);
        print(nums2);
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
