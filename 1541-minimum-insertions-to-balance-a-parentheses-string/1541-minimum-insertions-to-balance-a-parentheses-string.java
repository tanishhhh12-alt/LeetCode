class Solution {
    public int minInsertions(String s) {
        int need =0;
        int ans =0;

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                need=need+2;

                if(need % 2 == 1){
                    ans++;
                    need--;
                }
            }else{
                need--;
                    if(need==-1){
                        ans++;
                        need = 1;
                    
            }
            }
        }
        return ans+need;
    }
}