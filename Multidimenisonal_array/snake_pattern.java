package Multidimenisonal_array;

public class snake_pattern {
    void print_Snake(int mat[][],int r, int c){
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                   System.out.println(mat[i][j]+ " ");
                }

            }
            else{
                for(int j=c-1;j>=0;j--){
                    System.out.println(mat[i][j]+ " ");
                }
            }
        }
    }
}

