class MinStack {
    int[] stack;
    int[] minStack;
    int top;
    int n;
   
    public MinStack() {
       n = 9999;
       stack = new int[n];
       minStack = new int[n];
       top = -1; 
    }
    
    public boolean empty(){
        return top == -1;
    }
    public boolean full(){
        return top == n - 1;
    }

    public void push(int val) {
        if(full()){
            return;
        }
        stack[++top] = val;
    }
    
    public void pop() {
        if(empty()){
            return ;
        }
        top--;
        
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        int min = stack[0]; 
        for (int i = 0; i < n; i++) { 
            if (min > stack[i]) { 
                min = stack[i]; 
            } 
        } 

        return min;
    }
}
