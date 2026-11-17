class Solution {
    public int longestStrChain(String[] words) {
       Arrays.sort(words,(a,b)-> Integer.compare(a.length(),b.length()));
       return solve(words,0,-1);
    }
    public int solve(String[] words,int i, int pi){
        if(i>= words.length){
            return 0;
        }
        int take =0;
        int skip =0;
        if(pi == -1 ||isprec(words[i],words[pi])){
            take = 1+ solve(words,i+1,i);
            skip = solve(words,i+1,pi);
        }else{
            skip = solve(words,i+1,pi);
        }
        return Math.max(take,skip);
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