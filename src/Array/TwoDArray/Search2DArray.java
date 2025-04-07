package DataStructure.Array.TwoDArray;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 100;
        boolean result=searchTarget(matrix,target);
        System.out.println("Result : "+result);
    }
    public static boolean searchTarget(int[][] matrix , int target){
        int rowLen=matrix.length;
        for(int row=0;row<rowLen;row++) {
            int colLen = matrix[row].length;
            if (target >= matrix[row][0] && target <= matrix[row][colLen - 1]) {
                int first = 0;
                int last = colLen - 1;
                while (last >= first) {
                    int mid = (first + last) / 2;
                    if (matrix[row][mid] == target) return true;
                    else if (matrix[row][mid] < target) first = mid + 1;
                      else last = mid-1;
                }
            }
        }
        return false;
    }
}
