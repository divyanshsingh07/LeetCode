class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int mxl=0;
        while(l<r){
            int hig=Math.min(h[l],h[r]);
            int w=r-l;
            int a=hig*w;
            mxl=Math.max(mxl,a);
            if(h[l]<h[r]) l++;
            else r--;

        }
        
    return mxl;
    }
}