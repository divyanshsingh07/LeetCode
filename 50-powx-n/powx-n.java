class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        long p=n;
        double r =1.0;
        if(p<0){
            x=1/x;
            p=-p;
        }
        while (p!=0){
            if(p%2==0){
                x=x*x;
                p=p/2;
            }
            else{
                r=r*x;
                p=p-1;
            }
        }
        return r;
        
    }
}