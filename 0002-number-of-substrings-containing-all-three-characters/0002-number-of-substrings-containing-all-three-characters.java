class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int st =0;
        int e =0;
        int ans =0;
        while(e<s.length()){
            char ch = s.charAt(e);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            while(mp.size() == 3){
                ans+= s.length()-e;

                char lc = s.charAt(st);
                mp.put(lc,mp.get(lc)-1);
                if(mp.get(lc) == 0){
                    mp.remove(lc);
                }
                st++;
            }
            e++;
        }
        return ans;
    }
}