class MinStack {
    List<Integer> list ; 
    PriorityQueue<Integer> pq ; 
    public MinStack() {
        list = new ArrayList<>() ; 
        pq = new PriorityQueue<>() ; 
    }
    
    public void push(int val) {
        list.add(val) ; 
        pq.add(val) ; 
    }
    
    public void pop() {
        int getLast = list.get(list.size()-1) ; 
        list.remove(list.size()-1) ; 
        pq.remove(getLast) ; 
    }
    
    public int top() {
        return list.get(list.size()-1) ; 
    }
    
    public int getMin() {
        return pq.peek() ; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */