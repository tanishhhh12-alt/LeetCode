class Solution {
    public String maskPII(String s) {
        if(s.indexOf('@') != -1){
            s = s.toLowerCase();
            int at = s.indexOf('@');

            return s.charAt(0) + "*****" +  s.charAt(at-1) + s.substring(at);
        }else{
            StringBuilder sb = new StringBuilder();

            for(int i =0;i<s.length();i++){
                char ch = s.charAt(i);
                if(Character.isDigit(ch)){
                    sb.append(ch);
                }


            }

            int n = sb.length();
            String L = "***-***-" + sb.substring(n-4);

            if(n==10){
                return L;
            }

            StringBuilder ans = new StringBuilder("+");
            for(int i =0;i<n-10;i++){
                ans.append("*");
            }

            ans.append("-").append(L);
            return ans.toString();
        }
    }
}