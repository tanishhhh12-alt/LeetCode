class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        Stack<Integer> st = new Stack<>();
        int[] ans = new int [n];
        int pt =0;
        for(String log:logs){
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type= parts[1];
            int time = Integer.parseInt(parts[2]);

            if(type.equals("start")){
                if(!st.isEmpty()){
                    ans [st.peek()]+=time - pt;
                }
                st.push(id);
                pt = time;
            }else{
               ans[st.pop()] += time-pt+1;
               pt = time+1;
            }
        }
        return ans;
    }
}