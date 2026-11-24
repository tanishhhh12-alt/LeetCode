class Solution {
    public int maxLength(int[] nums) {
        int s =0;
        int e =0;
        int max=0;
        
        while(e<nums.length){
           int prod =1;
           int gcd =0;
           int lcm =1;
            int j =e;
           while(j<nums.length){
            prod *= nums[j];

            if(gcd == 0){
                gcd = nums[j];
            }else{
                gcd =  gcd(gcd,nums[j]);
            }

            lcm = lcm(lcm,nums[j]);


            if(prod == lcm * gcd){
                max= Math.max(max,j-e+1);
            }
            j++;
           }

           e++;




            
        }
        return max;
    }

    public int gcd(int a,int b){
        while(b!=0){
            int temp =b;
            b= a%b;
            a= temp;
        }
    return a;
    }

    public int lcm(int a,int b){
        return(a/gcd(a,b)) * b;
    }
}