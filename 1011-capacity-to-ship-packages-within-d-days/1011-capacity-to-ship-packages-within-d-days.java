class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mw = -1;
        int tw =0;

        for(int w : weights){
            mw = Math.max(mw,w);
            tw +=w;
        }
        int left = mw;
        int right = tw;

        while(left<right){
            int mid = (right+left)/2;

            int dn =1;
            int cw =0;
            
            for(int w : weights){
                if(cw+w>mid){
                    dn++;
                    cw=0;
                }
                cw+=w;
            }
            if(dn>days){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}