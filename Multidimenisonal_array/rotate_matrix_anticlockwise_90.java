package Multidimenisonal_array;

public class rotate_matrix_anticlockwise_90 {
    // naive-solution
    // last-column becomes first row
    // second last column becomes second row
    // third last column becomes third row
    // fourth last column becomes fourth row

    // naive-solution
    void rotate(int mat[][], int rows, int cols) {
        int temp[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[rows - j - 1][i] = mat[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = temp[i][j];
            }
        }
    }

    //for efficient solution , take the transpose of the matrix and reverse individual columns
     void eff_rotate(int mat[][] , int rows , int cols){
        for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
          }
        }
        for(int i=0;i<rows;i++){
            int low = 0 , high = cols-1;
            while(low<high){
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
     }
}
