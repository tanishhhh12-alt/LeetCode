class Solution {
    public boolean isPossible(int[] target) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      long sum =0;
      for(int i =0;i<target.length;i++){
        pq.offer(target[i]);
        sum+=target[i];
      }

      while(true){
        int max = pq.poll();
        long rest = sum-max;

        if(max == 1 || rest == 1){
            return true;
        }

        if(rest ==0 || rest>=max || max%rest ==0){
            return false;
        }

        int nv =(int)(max %rest);
        pq.offer(nv);
        sum = nv+rest;
      }

       
    }
}