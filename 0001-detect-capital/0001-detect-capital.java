class Solution {
    public boolean detectCapitalUse(String word) {
        int uper=0;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                uper++;
            }
        }
        if(uper == word.length()|| uper == 0){
            return true;
        }
        return uper ==1 && Character.isUpperCase(word.charAt(0));
    }
}