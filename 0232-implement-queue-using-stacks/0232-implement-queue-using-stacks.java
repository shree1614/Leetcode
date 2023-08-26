

class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack <Integer>s2 = new Stack<>();

    public MyQueue() {
        // if ye stack s1,s2 ko hata dege to code thora slow ho jyega
         Stack s1;
        Stack s2;
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int ans=s2.pop();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return ans;
    }
    
    public int peek() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int ans=s2.peek();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return ans;
    }
    
    public boolean empty() {
         return s1.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */