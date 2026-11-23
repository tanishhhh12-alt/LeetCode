class ProductOfNumbers {
ArrayList<Integer> a;
    public ProductOfNumbers() {
        a = new ArrayList<>();
    }
    
    public void add(int num) {
        a.add(num);
    }
    
    public int getProduct(int k) {
        int p=1;
        for(int i = a.size()-1;i>=a.size()-k;i--){
            p = p * a.get(i);
        }

        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */