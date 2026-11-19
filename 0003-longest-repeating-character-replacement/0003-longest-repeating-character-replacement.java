class Solution {
    public int characterReplacement(String s, int k) {
        int st =0;
        int e =0;
        int max =0;
        int ans =0;
        HashMap<Character,Integer> mp = new HashMap<>();

        while(e<s.length()){
            char ch = s.charAt(e);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            max = Math.max(max,mp.get(ch));

            while(e-st+1-max>k){
                char cl = s.charAt(st);
                mp.put(cl,mp.get(cl)-1);
                if(mp.get(cl) == 0){
                    mp.remove(cl);
                }
                
                st++;

            }
            ans = Math.max(ans,e-st+1);
            e++;
        }
        return ans;

    }
}