class TwoStacks{
    int arr[];
    int cap, top1, top2;
    TwoStacks(int n){
        cap=n;
        top1=-1;
        top2=n;
        arr=new int[n];
    }
    boolean push(int x){
        if(top1<top2 -1){
            top1++;
            arr[top1]=x;
            return true;
        }
    return false;
    }
    boolean push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2]=x;
            return true;
        }
        return false;
    }
    Integer pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }
        return -1;
    }
    Integer pop2(){
        if(top2<cap){
            int x=arr[top2];
            top2++;
            return x;
        }
        return -1;
    }
    int size1(){
        return (top1+1);
    }
    int size2(){
        return (cap-top2);
    }
}
public class twoStacksInAnArray {
    void print(){
        System.out.println("Hello World");
    }
}



