package Multidimenisonal_array;

public class search_sorted_matrix {
    //naive approach
    void search_element(int mat[][], int rows, int cols, int target){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==target){
                    System.out.println(i + " " + j);
                } 
            }
        }
    }
    
    //efficient approach
    //let target element be t;
    // begin from the top right corner
    //if x is same , print position and return
    //if x is smaller, move left
    //if x is greater, move down
    void eff_search_element(int mat[][] , int r,int c, int x){
        int i=0,j=c-1;
        while(i<r && j>=0 ){
            if(mat[i][j]==x){
                System.out.println(i + " " + j);
                return;
            }
            else if(mat[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
    }
}
