class Solution {
    public int longestStrChain(String[] words) {
       Arrays.sort(words,(a,b)-> Integer.compare(a.length(),b.length()));
        int[] dp = new int[words.length +1];

        Arrays.fill(dp,1);
        int max =1;

        for(int i =0;i<words.length;i++){
            for(int j =0;j<i;j++){
                if(words[i].length()  == words[j].length()+1 && isprec(words[i],words[j])){
                    dp[i] = Math.max(dp[i],1+ dp[j]);
                }
                max = Math.max(max,dp[i]);
            }
        }
        return max;
    
    
    
    
    }
    boolean isprec(String ce,String pe){
        if(ce.length()  != pe.length() +1){
            return false;
        }
        int i =0;
        int j =0;

        while(j<ce.length() && i<pe.length()){
            if(pe.charAt(i) == ce.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i == pe.length();
    }
}