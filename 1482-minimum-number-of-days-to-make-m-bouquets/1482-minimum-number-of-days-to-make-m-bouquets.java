class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long fm = (long)m * k;
        if(fm>bloomDay.length){
            return -1;
        }
        int low =Integer.MAX_VALUE;
        int high = 0;

        for(int day : bloomDay){
            low = Math.min(low,day);
            high=Math.max(high,day);
        }

        while(low<high){
            int mid = low + (high-low)/2;

            if(canMake(bloomDay,m,k,mid)){
                high = mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean canMake(int[] bloomDay, int m, int k,int day){
        int boq=0;
        int flo =0;

        for(int bloom : bloomDay){
            if(bloom<=day){
                flo++;
                if(flo==k){
                    boq++;
                    flo=0;
                    if(boq>=m){
                        return true;
                    }
                }
            }else{
                flo =0;
            }
        }
        return false;
    }
}