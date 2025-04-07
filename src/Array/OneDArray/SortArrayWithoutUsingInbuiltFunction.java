package Array.OneDArray;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int len = arr.length;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int[] newArr = new int[len];
        int index=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            for(int i=0;i<value;i++){
                arr[index++]=key;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
