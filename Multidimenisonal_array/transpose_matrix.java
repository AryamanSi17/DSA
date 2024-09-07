
package Multidimenisonal_array;

public class transpose_matrix {
    void naive_transpose(int matrix[][] , int n){
        int rows=matrix.length;
        int cols=matrix[0].length;
         int temp[][]=new int[cols][rows];
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                temp[j][i]=matrix[i][j];
            }
         }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=temp[i][j];
            }
         }
    }
    //efficient solution uses idea that diagonal elements are same 
    void eff_transpose(int mat[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
