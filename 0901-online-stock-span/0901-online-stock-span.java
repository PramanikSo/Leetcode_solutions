class StockSpanner {
    Stack<Pair>stack;
    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!stack.isEmpty() && price>= stack.peek().a){
            span+= stack.peek().b;
            stack.pop();
        }
        stack.push(new Pair(price,span));
        return span;
    }
   
}

class Pair{
    int a,b;
    Pair(int a, int b){
        this.a=a;
        this.b=b;
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */ 