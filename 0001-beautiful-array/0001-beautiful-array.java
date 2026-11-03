class Solution {
    public int[] beautifulArray(int n) {

        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size()<n){
            ArrayList<Integer> temp = new ArrayList<>();
             for(int x =0;x<ans.size();x++){
                if( 2  * ans.get(x) -1 <=n){
                    temp.add(2 *ans.get(x)-1);
                }
            }

            for(int x =0;x<ans.size();x++){
                if(2 * ans.get(x)<=n){
                    temp.add(2 * ans.get(x));
                }
            }

           

            ans = temp;
        }

        int res[] = new int[n];

        for(int i =0;i<n;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}