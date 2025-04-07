package DataStructure.Array.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {

        //int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //System.out.println(Math.max(0,1));
        int[][] intervals ={{0,0},{1,4}};
        intervals=mergeIntervals(intervals);
        //intervals=merge(intervals);
        print(intervals);
    }
    public static int[][] mergeIntervals(int[][] intervals){
        int slow=0;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        for(int fast=1;fast<intervals.length;fast++){
            if(intervals[slow][1] >= intervals[fast][0]){
                intervals[slow][1]=Math.max(intervals[slow][1],intervals[fast][1]);
            }
            else{
                slow++;
                intervals[slow] = intervals[fast];
            }
        }
        return Arrays.copyOfRange(intervals,0,slow+1);
    }
    public static int[][] merge(int[][] intervals) {
        int slow=0;
        for(int index=1;index<intervals.length;index++){
            if(intervals[index-1][0]>intervals[index][0]){
                int temp=intervals[index][0];
                intervals[index][0]=intervals[index-1][0];
                intervals[index-1][0]=temp;
            }
        }
        for(int fast=1;fast<intervals.length;fast++){
            if(intervals[slow][1] >= intervals[fast][0]){
                intervals[slow][1]=Math.max(intervals[slow][1],intervals[fast][1]);
            }
            else{
                slow++;
                intervals[slow]=intervals[fast];
            }
        }
        int[][] result= Arrays.copyOfRange(intervals,0,slow+1);
        return result;
    }
    public static void print(int[][] arr){
        for(int[] resultArr : arr){
            System.out.println("["+resultArr[0]+", "+resultArr[1]+"]");
        }
    }
}
