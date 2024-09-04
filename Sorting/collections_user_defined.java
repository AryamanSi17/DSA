package Sorting;

import java.util.ArrayList;
import java.util.List;

class Point implements Comparable<Point>{
    int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public  int compareTo(Point p){
        return this.x-p.x;
    }
}
public class collections_user_defined {
   public static void main(String[] args) {
       List <Integer> list =new ArrayList <Integer>();
       list.add(new Point(5,10));
       list.add(new Point(2,20));
       list.add(new Point(10,30));
   }
   Collections.sort(list);
}
