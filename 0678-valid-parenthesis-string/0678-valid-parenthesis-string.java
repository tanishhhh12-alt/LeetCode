class Solution {
    public boolean checkValidString(String s) {
        int oc =0;
        int cc =0;
        int length = s.length()-1;
      
        int e =0;

        while(e<=length){
            char ch = s.charAt(e);
            if(ch == '(' || ch == '*'){
                oc++;
            }else{
                oc--;
            }
            char ch2 = s.charAt(length - e);
            if(ch2 == ')' || ch2 == '*'){
                cc++;
            }else{
                cc--;
            }

            if(oc < 0 || cc < 0){
                return false;
            }
            e++;
        }
        return true;
    }
}