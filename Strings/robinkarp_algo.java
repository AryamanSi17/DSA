package Strings;

public class robinkarp_algo {
    void search(String pat, String txt, int m, int n){
        int h=1;
  int d=5; int q=13;
        for(int i=0;i<m-1;i++){
            h=(h*d)%q;
        }
        int p=0,t=0;
        for(int i=0;i<m;i++){
            p=(d*p+pat.charAt(i))%q;
            t=(d*t+txt.charAt(i))%q;
        }
        for(int i=0;i<=n-m;i++){
            if(p==t){
                System.out.println("pattern found at index "+i);
            }
            if(i<n-m){
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q;
                if(t<0){
                    t=t+q;
                }
            }
        }
    }
}
