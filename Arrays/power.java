package Arrays;

public class power {
    
        public double myPow(double x, int n) {
            double answer=1;
            long N=n;
            if(N==0) return 1;
            if(N<0){
                x=1/x;
                N=-N;
            }
    
            while(N>0){
                if(N%2==1){
                    answer *= x;
                }
                x *= x;
                N = N/2;
            }
            return answer;
        }
}

