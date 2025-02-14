class ProductOfNumbers {
    ArrayList<Integer> r=new ArrayList<>();

    public ProductOfNumbers() {
        r=new ArrayList<>();
    }
    
    public void add(int num) {
        r.add(num);
        
    }
    
    public int getProduct(int k) {
        int i=r.size()-1;
        int p=1;
        while(k-->0){
            p*=r.get(i);
            i--;

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