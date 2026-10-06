class Solution {
    public int countStudents(int[] s, int[] san) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<s.length;i++){
            q.offer(s[i]);
        }
        int index=0;
        int  count =0;
        while(!q.isEmpty() && count< q.size()){
            if(q.peek() == san[index]){
                q.poll();
                index++;
                count=0;}
            else{
                q.offer(q.poll());
                count++;
        }
        }
        return q.size();
    }
}