class MyStack {
Queue<Integer> q;

Queue<Integer> q2;
    public MyStack() {
        q = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
         q2.offer(x);
         while(!q.isEmpty()){
            q2.offer(q.poll());
         }

         Queue<Integer> temp = q;
         q=q2;
         q2 = temp; 
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    
    public boolean empty() {
        return q.isEmpty()  && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */