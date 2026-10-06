class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int count =0;

        for(int i =0;i<tickets.length;i++){
            q.offer(i);
        }

        while(!q.isEmpty()){

            int p = q.poll();
            tickets[p]--;
            count++;
             
                if(tickets[p] ==0){
                
                    if(p==k){
                        return count;
                    }
                }
                    
                else{
                    q.offer(p);
                }
                
        }
            
            
           
        
        return count;
    }
}