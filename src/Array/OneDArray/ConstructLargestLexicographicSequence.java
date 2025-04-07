package Array.OneDArray;

public class ConstructLargestLexicographicSequence {
    public static void main(String[] args) {
        int[] result = constructArray(5);
        print(result);
    }
    public static int[] constructArray(int num) {
        int len=2*(num-1)+1;
        int[] arr = new int[len];
        for(int n=num; n>=2; n--){
            int i=0;
            while(i < len){
                if(arr[i]==0 && (i+n < len) && arr[i+n]==0){
                    arr[i]=n;
                    arr[i+n]=n;
                    break;
                }
                i++;
            }
        }

        return arr;
    }
    public static void print(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
