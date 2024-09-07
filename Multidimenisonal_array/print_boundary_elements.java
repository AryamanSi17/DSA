package Multidimenisonal_array;

public class print_boundary_elements {
    void boundary_traversal(int mat[][],int r, int c){
        if (r==1) {
            for(int i=0;i<c;i++){
                System.out.println(mat[0][i] + " ");
            }
        }
        else if(c==1){
            for(int i=0;i<r;i++){
                System.out.println(mat[i][0]+" ");
            }
        }
        else{
            for(int i=0;i<c;i++){
                System.out.println(mat[0][i] + " ");
        }
        for(int i=1;i<r;i++){
            System.out.println(mat[i][c-1] + " ");
        }
        for(int i=c-2;i>=0;i--){
            System.out.println(mat[r-1][i] + " ");
        }
        for(int i=r-2;i>0;i--){
            System.out.println(mat[i][0] + " ");
        }
    }
}
}