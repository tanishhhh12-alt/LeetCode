class Solution {
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs,(a,b) ->Integer.compare(a[1],b[1]));
        int chain =1;
        int[] curr = pairs[0];
        for(int i =0;i<pairs.length;i++){
            if(curr[1]<pairs[i][0]){
                curr = pairs[i];
                chain++;
            }
        }

        return chain;




    }
}