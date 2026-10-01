class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int e=0;
        int max =0;
        HashSet<Character> mp = new HashSet<>();

        while(e<s.length()){
            char ch = s.charAt(e);

            if(!mp.contains(ch)){
                mp.add(ch);
                max = Math.max(max,e-st+1);
            }else{
                while(s.charAt(st)!=ch){
                    mp.remove(s.charAt(st));
                    st++;
                }

                mp.remove(ch);
                st++;
                mp.add(ch);

            }
            e++;
        }
        return max;
    }
}