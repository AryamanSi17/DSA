package Multidimenisonal_array;

import java.util.ArrayList;
import java.util.List;

public class spiral_traversal {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> result=new ArrayList<>();
        int rows=mat.length;
        int cols=mat[0].length;
         int top=0, bottom= rows-1,right=cols-1,left=0;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(mat[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(mat[i][left]);
            }
            left++;
        }}
        return result;
    }
}
