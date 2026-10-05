class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(0);
            }else {
                int top = st.pop();
                if(top ==0){
                    st.push(st.pop()+1);
                }else{
                    st.push(st.pop() + 2 * top);
                }

            }
        }
        return st.pop();
    }
}