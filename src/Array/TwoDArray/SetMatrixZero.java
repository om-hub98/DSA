package DataStructure.Array.TwoDArray;

import java.util.Arrays;

/**
 * @author omraj
 */
public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] originalMatrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int [][] matrix = Arrays.copyOf(originalMatrix,originalMatrix.length);

        System.out.println("Original Matrix ::");
        for(int i=0; i<originalMatrix.length;i++){
            for(int j=0; j<originalMatrix[0].length;j++){
                System.out.print(originalMatrix[i][j]+" ");
            }
            System.out.println();
        }
        MatrixSolution matrixSolution = new MatrixSolution();
        matrixSolution.setZeroes(matrix);
    }
}
class MatrixSolution {
    public void setZeroes(int[][] matrix) {
        //int[][] copyMatrix = Arrays.copyOf(matrix,matrix.length);
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[][] copyMatrix = new int[rowLen][colLen];
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                copyMatrix[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(matrix[i][j]==0){
                    for(int copy_row=0; copy_row<rowLen; copy_row++)
                        copyMatrix[copy_row][j]=0;
                    for(int copy_column=0; copy_column<rowLen; copy_column++)
                        copyMatrix[i][copy_column]=0;
//                    System.out.println("test matrix:");
//                    print(matrix);
                    //setMinusOne(matrix,i,j);
                }
            }
        }
        matrix=copyMatrix;
        print(matrix);
//        setSpeciifcElementZero(matrix);
    }
//    public void setMinusOne(int[][] matrix, int row, int column){
//        int rowLen = matrix.length;
//        int colLen = matrix[0].length;
//        for(int i=0;i<rowLen;i++){
//            for(int j=0;j<colLen;j++){
//                if((i==row || j==column) && matrix[i][j]!=0){
//                    matrix[i][j]=-1;
//                }
//            }
//        }
//    }
    public void setMinusOne(int[][] matrix, int row, int column){
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if((i==row || j==column)){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void setSpeciifcElementZero(int[][] matrix){
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public void print(int[][] matrix){
        System.out.println("Updated Matrix");
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
