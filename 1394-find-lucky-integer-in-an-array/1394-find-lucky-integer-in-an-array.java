class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max=-1;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];

            mp.put(curr,mp.getOrDefault(curr,0)+1);

           
        }

        for(int i =0;i<arr.length;i++){
            int curr = arr[i];
            if(mp.get(curr) == curr ){
                max = Math.max(max,curr);
            }
        }
        return max;
    }
}