class Solution {
    public boolean lemonadeChange(int[] bills) {
       HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i =0;i<bills.length;i++){
            int curr = bills[i];
            if(curr == 5){
            mp.put(curr,mp.getOrDefault(curr,0)+1);
            }else if(curr == 10){
                if(mp.containsKey(5)){
                    mp.put(5,mp.get(5)-1);

                    if(mp.get(5) == 0){
                        mp.remove(5);
                    }
                     mp.put(curr,mp.getOrDefault(curr,0)+1);
                }else{
                    return false;
                }
            }else{
                if(mp.containsKey(10) && mp.containsKey(5)){
                    mp.put(10,mp.get(10)-1);
                    if (mp.get(10) == 0)
                        mp.remove(10);
                    mp.put(5,mp.get(5)-1);
                    if (mp.get(5) == 0)
                        mp.remove(5);
                }else if(mp.containsKey(5) && mp.get(5) >= 3){
                    mp.put(5,mp.get(5)-3);
                    if (mp.get(5) == 0)
                        mp.remove(5);
                }else{
                    return false;
                }
            }
        }

        
        return true;
    }
}