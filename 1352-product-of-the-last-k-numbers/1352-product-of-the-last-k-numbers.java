class ProductOfNumbers {
ArrayList<Integer> a;
    public ProductOfNumbers() {
        a = new ArrayList<>();
        a.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            a.clear();
            a.add(1);
        }else{
            int lp = a.get(a.size()-1);
            a.add(lp*num);
        }

    }
    
    public int getProduct(int k) {
      if(k>=a.size()){
        return 0;
      }

      return a.get(a.size()-1)/a.get(a.size()-k-1);
      
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */