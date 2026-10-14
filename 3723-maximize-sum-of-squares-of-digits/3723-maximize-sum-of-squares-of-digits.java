class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum<1 || sum > 9*num ){
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while(num>0){
            int x = Math.min(9,sum);

            ans.append((char)(x + '0'));
            sum-=x;
            num--;
        }
        return ans.toString();
    }
}